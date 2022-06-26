package com.mobasshir.queue;

public class UsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }

    public static class Queue {
        static int MAX = 1000;
        static int[] arr = new int[MAX];
        static int rear;

        Queue() {
            rear = -1;
        }

        public static boolean isEmpty() {
            return (rear < 0);
        }

        public static void add(int data) {
            if (rear >= (MAX - 1)) {
                System.out.println("Queue is full");
            } else {
                arr[++rear] = data;
            }
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                return arr[0];
            }
        }
    }
}
