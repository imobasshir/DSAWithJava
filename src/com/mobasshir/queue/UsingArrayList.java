package com.mobasshir.queue;

import java.util.ArrayList;

public class UsingArrayList {
    /**
     * Queue
     */
    public static class Queue {
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void add(int data) {
            list.add(data);
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = list.get(0);
            list.remove(0);
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(0);
        }
    }


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
}
