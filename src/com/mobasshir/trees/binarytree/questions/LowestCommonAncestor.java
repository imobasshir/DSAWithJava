package com.mobasshir.trees.binarytree.questions;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collectors;
import com.mobasshir.trees.binarytree.Node;

public class LowestCommonAncestor {
    public static Node lowestCommonAncestor(Node root, int i, int j) {
        if (root == null || root.data == i || root.data == j) {
            return root;
        }
        
        Node left = lowestCommonAncestor(root.left, i, j);
        Node right = lowestCommonAncestor(root.right, i, j);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);
        root.right.left = new Node(8);
        root.right.right = new Node(9);

        // List<Integer> a1 = new ArrayList<>();
        // List<Integer> a2 = new ArrayList<>();
        // // lca(4, 7)
        // RootToNode.getPath(root, a1, 4);
        // RootToNode.getPath(root, a2, 7);

        // List<Integer> lca = a1.stream().filter(a2::contains).collect(Collectors.toList());
        // System.out.println(lca.get(lca.size() - 1));

        System.out.println(lowestCommonAncestor(root, 5, 7).data);
    }
}
