package com.mobasshir.trees.binarytree.questions;

import com.mobasshir.trees.binarytree.Node;

public class AddARowInTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.left = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(addOneRow(root, 1, 2));
    }

    public static Node addOneRow(Node root, int val, int depth) {
        if (depth == 1) {
            Node newRoot = new Node(val);
            newRoot.left = root;
            return newRoot;
        }
        helper(root, val, depth, 1);
        return root;
    }

    private static void helper(Node root, int val, int depth, int h) {
        if (depth - 1 == h) {
            Node newRoot1 = new Node(val);
            Node newRoot2 = new Node(val);
            newRoot1.left = root.left;
            newRoot2.right = root.right;
            root.left = newRoot1;
            root.right = newRoot2;
            return;
        }
        if (root.left != null)
            helper(root.left, val, depth, h + 1);
        if (root.right != null)
            helper(root.right, val, depth, h + 1);
    }
}
