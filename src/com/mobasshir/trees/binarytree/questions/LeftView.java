package com.mobasshir.trees.binarytree.questions;

import java.util.ArrayList;
import java.util.List;

import com.mobasshir.trees.binarytree.Node;

public class LeftView {
    public static List<Integer> leftSideView(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        leftView(root, result, 0);
        return result;
    }

    public static void leftView(Node curr, List<Integer> result, int currDepth) {
        if (curr == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(curr.data);
        }

        leftView(curr.left, result, currDepth + 1);
        leftView(curr.right, result, currDepth + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(leftSideView(root));
    }
}
