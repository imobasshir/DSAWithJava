package com.mobasshir.stack;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();
        static int curr_size;

        Stack() {
            curr_size = 0;
        }

        static boolean isEmpty() {
            return q1.size() == 0;
        }

        static void push(int x) {
            curr_size++;
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            // swap in queues
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static int pop() {
            if (q1.isEmpty()) {
                return -1;
            }
            curr_size--;
            return q1.remove();
        }

        static int peek() {
            if (q1.isEmpty()) {
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
