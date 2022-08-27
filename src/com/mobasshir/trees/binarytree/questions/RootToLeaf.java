package com.mobasshir.trees.binarytree.questions;

import java.util.ArrayList;

import com.mobasshir.trees.binarytree.Node;

public class RootToLeaf {
    static void getPath(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        arr.add(root.data);

        // isLeaf
        if (root.left == null && root.right == null) {
            System.out.println(arr);
            return;
        }

        getPath(root.left, arr);
        arr.remove(arr.size() - 1);
        getPath(root.right, arr);
        arr.remove(arr.size() - 1);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);

        ArrayList<Integer> arr = new ArrayList<>();
        getPath(root, arr);
    }
}
