package com.mobasshir.queue;

import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(queue.remove());
        }
    }

    public static class Queue {
        static Stack<Integer> ip = new Stack<>();
        static Stack<Integer> op = new Stack<>();

        public static void add(int data) {
            ip.add(data);
        }

        public static int remove() {
            if (!op.isEmpty()) {
                return op.pop();
            } else {
                while (!ip.isEmpty()) {
                    op.push(ip.pop());
                }
                return op.pop();
            }
        }

        public static int peek() {
            if (!op.isEmpty()) {
                return op.peek();
            } else {
                while (!ip.isEmpty()) {
                    op.push(ip.pop());
                }
                return op.peek();
            }
        }
    }
}
