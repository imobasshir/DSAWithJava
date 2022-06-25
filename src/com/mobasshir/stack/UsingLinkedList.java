package com.mobasshir.stack;

public class UsingLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            int top = head.data;
            if (isEmpty()) {
                return -1;
            }
            head = head.next;
            return top;
        }

        public static int peek() {
            int top = head.data;
            if (isEmpty()) {
                return -1;
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        // System.out.println(stack.peek());
        stack.push(2);
        stack.push(3);
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        stack.push(0);
        // System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
