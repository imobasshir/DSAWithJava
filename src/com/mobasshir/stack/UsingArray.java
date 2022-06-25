package com.mobasshir.stack;

public class UsingArray {

    public static class Stack {
        static final int MAX = 1000;
        static int top;
        static int a[] = new int[MAX];

        Stack() {
            top = -1;
        }

        public static boolean isEmpty() {
            return (top < 0);
        }

        public static void push(int x) {
            if (top >= (MAX - 1)) {
                System.out.println("Stack Overflow");
            } else {
                a[++top] = x;
            }
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                int x = a[top--];
                return x;
            }
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                int x = a[top];
                return x;
            }
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
