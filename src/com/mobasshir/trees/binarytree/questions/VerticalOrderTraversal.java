package com.mobasshir.trees.binarytree.questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import com.mobasshir.trees.binarytree.Node;
import com.mobasshir.trees.binarytree.Tuple;

public class VerticalOrderTraversal {
    public static List<List<Integer>> findVertical(Node root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0, 0));
        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            Node node = tuple.node;
            int vertical = tuple.row;
            int level = tuple.col;

            if (!map.containsKey(vertical)) {
                map.put(vertical, new TreeMap<>());
            }
            if (!map.get(vertical).containsKey(level)) {
                map.get(vertical).put(level, new PriorityQueue<>());
            }
            map.get(vertical).get(level).offer(node.data);

            if (node.left != null) {
                q.offer(new Tuple(node.left, vertical - 1, level + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, vertical + 1, level + 1));
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.left = new Node(9);
        root.right.right = new Node(10);

        System.out.print("The Vertical Traversal is:- " + findVertical(root));
    }
}
