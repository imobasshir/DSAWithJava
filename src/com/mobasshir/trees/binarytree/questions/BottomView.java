package com.mobasshir.trees.binarytree.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import com.mobasshir.trees.binarytree.Node;
import com.mobasshir.trees.binarytree.Pair;

public class BottomView {
    public static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair it = q.remove();
            int num = it.num;
            Node node = it.node;
            map.put(num, node.data);
            if (node.left != null) {
                q.add(new Pair(node.left, num - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, num + 1));
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(bottomView(root));
    }
}
