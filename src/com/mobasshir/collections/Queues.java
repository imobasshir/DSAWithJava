package com.mobasshir.collections;

import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = { 1, 4, 5, 8, 9, 7 };
        for (int i : arr) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}
