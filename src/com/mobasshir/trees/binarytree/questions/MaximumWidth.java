package com.mobasshir.trees.binarytree.questions;

import java.util.LinkedList;
import java.util.Queue;

import com.mobasshir.trees.binarytree.Node;
import com.mobasshir.trees.binarytree.Pair;

public class MaximumWidth {
    public static int maxWidth(Node root) {
        if (root == null) return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while (!q.isEmpty()) {
            int size = q.size();
            int mmin = q.peek().num; 
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                int cur_id = q.peek().num - mmin;
                Node node = q.peek().node;
                q.poll();
                if (i == 0) first = cur_id;
                if (i == size - 1) last = cur_id;
                if (node.left != null) q.offer(new Pair(node.left, cur_id * 2 + 1));
                if (node.right != null) q.offer(new Pair(node.right, cur_id * 2 + 2));
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(5);
        root.left.left.left = new Node(7);
        root.right = new Node(2);
        root.right.right = new Node(4);
        root.right.right.right = new Node(6);

        System.out.println(maxWidth(root));
    }
}
