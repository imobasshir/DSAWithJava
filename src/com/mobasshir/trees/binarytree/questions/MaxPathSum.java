package com.mobasshir.trees.binarytree.questions;

import com.mobasshir.trees.binarytree.Node;

public class MaxPathSum {
    static int max = Integer.MIN_VALUE;

    static int maxPath(Node root) {
        if (root == null)
            return 0;

        int maxL = Math.max(0, maxPath(root.left));
        int maxR = Math.max(0, maxPath(root.right));
        max = Math.max(max, maxL + maxR + root.data);

        return root.data + Math.max(maxL, maxR);
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        maxPath(root);
        System.out.println(max);
    }
}
