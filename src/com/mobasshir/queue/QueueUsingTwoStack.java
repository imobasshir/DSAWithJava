package com.mobasshir.queue;

import java.util.Stack;

public class QueueUsingTwoStack {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            // check weather s1 is not Empty then remove all element from s1 and add to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // then add element to s1
            s1.push(data);
            // then check weather s2 is not Empty then remove all element from s2 and add to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());    
            }
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
