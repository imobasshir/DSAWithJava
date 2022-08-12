package com.mobasshir.trees.binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeTraversal {
    static ArrayList<Integer> postOrderTrav1(Node cur) {
        ArrayList<Integer> postOrder = new ArrayList<>();
        if (cur == null)
            return postOrder;

        Stack<Node> st = new Stack<>();
        while (cur != null || !st.isEmpty()) {
            if (cur != null) {
                st.push(cur);
                cur = cur.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.data);
                    }
                } else
                    cur = temp;
            }
        }
        return postOrder;
    }

    static ArrayList<Integer> postOrderTrav(Node curr) {
        ArrayList<Integer> postOrder = new ArrayList<>();
        if (curr == null)
            return postOrder;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(curr);
        while (!s1.isEmpty()) {
            curr = s1.peek();
            s1.pop();
            s2.push(curr);
            if (curr.left != null)
                s1.push(curr.left);
            if (curr.right != null)
                s1.push(curr.right);
        }
        while (!s2.isEmpty()) {
            postOrder.add(s2.peek().data);
            s2.pop();
        }
        return postOrder;
    }

    static ArrayList<Integer> inOrderTrav(Node curr) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        while (true) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                if (stack.isEmpty())
                    break;
                curr = stack.peek();
                inOrder.add(curr.data);
                stack.pop();
                curr = curr.right;
            }
        }
        return inOrder;
    }

    static ArrayList<Integer> preOrderTrav(Node curr) {
        ArrayList<Integer> preOrder = new ArrayList<Integer>();
        if (curr == null)
            return preOrder;

        Stack<Node> stack = new Stack<>();
        stack.push(curr);

        while (!stack.isEmpty()) {
            Node topNode = stack.peek();
            preOrder.add(topNode.data);
            stack.pop();
            if (topNode.right != null)
                stack.push(topNode.right);
            if (topNode.left != null)
                stack.push(topNode.left);
        }
        return preOrder;

    }

    public static void main(String args[]) {
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

        ArrayList<Integer> preOrder = new ArrayList<>();
        preOrder = preOrderTrav(root);
        System.out.print("PreOrder Traversal:- ");
        System.out.println(preOrder);

        ArrayList<Integer> inOrder;
        inOrder = inOrderTrav(root);
        System.out.print("InOrder Traversal:- ");
        System.out.println(inOrder);

        ArrayList<Integer> postOrder;
        postOrder = postOrderTrav(root);
        System.out.print("PostOrder Traversal:- ");
        System.out.println(postOrder);

        ArrayList<Integer> postOrder1;
        postOrder1 = postOrderTrav1(root);
        System.out.print("PostOrder Traversal:- ");
        System.out.println(postOrder1);
    }
}
