package com.mobasshir.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(50);
        heap.add(5);
        System.out.println(heap);
        System.out.println(heap.peek());        // to return top element
        heap.add(2);
        heap.add(6);
        System.out.println(heap);

        Iterator<Integer> iterator = heap.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        heap.remove(50);
        System.out.println(heap);
        heap.poll();            // to remove top most priority element

        System.out.println(heap.toArray());
        System.out.println(heap.toString());
        System.out.println(heap.isEmpty());
    }
}
