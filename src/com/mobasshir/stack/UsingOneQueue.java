package com.mobasshir.stack;

import java.util.Queue;
import java.util.LinkedList;

public class UsingOneQueue {
    static class Stack {
        static Queue<Integer> q2 = new LinkedList<>();
        static int curr_size;

        Stack() {
            curr_size = 0;
        }

        static boolean isEmpty() {
            return q2.size() == 0;
        }

        static void push(int x) {
            curr_size++;
            q2.add(x);
            for (int i = 0; i < curr_size - 1; i++) {
                q2.add(q2.poll());
            }
        }

        static int pop() {
            if (q2.isEmpty()) {
                return -1;
            }
            curr_size--;
            return q2.remove();
        }

        static int peek() {
            if (q2.isEmpty()) {
                return -1;
            }
            return q2.peek();
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
