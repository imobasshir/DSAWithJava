package com.mobasshir.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        heap.add(50);
        heap.add(5);
        System.out.println(heap);
        System.out.println(heap.peek());        // to return top element
        heap.add(2);
        heap.add(6);
        System.out.println(heap);

        Iterator iterator = heap.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        heap.remove(50);
        System.out.println(heap);
        heap.poll();        // to remove top most priority element

        System.out.println(heap.toArray());
        System.out.println(heap.toString());
        System.out.println(heap.isEmpty());
        System.err.println(heap.peek());        // to return top most element i.e, top priority
    }
}
