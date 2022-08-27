package com.mobasshir.trees.binarytree.questions;

import java.util.ArrayList;
import java.util.List;

import com.mobasshir.trees.binarytree.Node;

public class RootToNode {
    static boolean getPath(Node root, List<Integer> arr, int x) {
        if (root == null)
            return false;

        arr.add(root.data);

        if (root.data == x)
            return true;

        if (getPath(root.left, arr, x) || getPath(root.right, arr, x))
            return true;

        arr.remove(arr.size() - 1);
        return false;
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

        System.out.println(getPath(root, arr, 7));
        System.out.println(arr);
    }
}
