package com.mobasshir.trees.binarytree.questions;

import java.util.ArrayList;

import com.mobasshir.trees.binarytree.Node;

public class BoundryTraversalClock {
    static Boolean isLeaf(Node root) {
        return (root.left == null) && (root.right == null);
    }

    static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.left;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.data);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
        for (int i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }

    static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node cur = root.right;
        while (cur != null) {
            if (isLeaf(cur) == false) res.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
    }

    static void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.right != null) addLeaves(root.right, res);
        if (root.left != null) addLeaves(root.left, res);
    }

    static ArrayList<Integer> printBoundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (isLeaf(node) == false) ans.add(node.data);
        addRightBoundary(node, ans);
        addLeaves(node, ans);
        addLeftBoundary(node, ans);    
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList<Integer> boundaryTraversal = printBoundary(root);
        System.out.println(boundaryTraversal);
    }
}
