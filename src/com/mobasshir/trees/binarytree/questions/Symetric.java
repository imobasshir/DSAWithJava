package com.mobasshir.trees.binarytree.questions;

import com.mobasshir.trees.binarytree.Node;

public class Symetric {
    public static boolean isSymmetric(Node root) {
        return root == null || isSymmetricHelp(root.left, root.right);
    }

    private static boolean isSymmetricHelp(Node left, Node right) {
        if (left == null || right == null)
            return left == right;
        if (left.data != right.data)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println(isSymmetric(root));
    }
}
