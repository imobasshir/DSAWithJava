package com.mobasshir.trees.binarytree.questions;

import com.mobasshir.trees.binarytree.Node;

public class BalancedBinaryTree {
    static boolean balancedBinaryTree(Node root) {
        if (root == null) return true;
        
        if (Math.abs(maxDepth(root.right) - maxDepth(root.left)) > 1) return false;

        boolean left = balancedBinaryTree(root.left);
        boolean right = balancedBinaryTree(root.right);

        if (left && right) return true;

        return false;
    }

    static int maxDepth(Node root) {
        if(root == null) return 0; 
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); 
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right.left = new Node(9);
        // root.right.right.right = new Node(10);

        System.out.println(balancedBinaryTree(root));
    }
}
