package com.mobasshir.trees.binarytree.questions;

import com.mobasshir.trees.binarytree.Node;

public class DiameterOfBT {
    static int max, maxi = 0;

    static void diameter(Node root) {
        if (root == null)
            return;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        max = Math.max(max, lh + rh);

        diameter(root.left);
        diameter(root.right);
    }

    static int maxDepth(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    static int diameterOfBT(Node root) {
        if (root == null)
            return 0;

        int lh = diameterOfBT(root.left);
        int rh = diameterOfBT(root.right);

        maxi = Math.max(maxi, lh + rh);
        return 1 + Math.max(lh, rh);
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

        diameter(root);
        System.out.println(max);

        diameterOfBT(root);
        System.out.println(maxi);
    }
}
