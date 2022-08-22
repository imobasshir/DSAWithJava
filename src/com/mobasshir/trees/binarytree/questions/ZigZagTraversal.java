package com.mobasshir.trees.binarytree.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import com.mobasshir.trees.binarytree.Node;

public class ZigZagTraversal {
    public static List<List<Integer>> zigZag(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<List<Integer>>();

        if (root == null) return res;
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new ArrayList<>(levelNum);
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.add(queue.peek().left);
                if (queue.peek().right != null) queue.add(queue.peek().right);
                if (flag == true) subList.add(queue.poll().data);
                else subList.add(0, queue.poll().data);
            }
            flag = !flag;
            res.add(subList);
        }
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println(zigZag(root));
    }
}
