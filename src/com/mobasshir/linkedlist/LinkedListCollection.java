package com.mobasshir.linkedlist;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);

        list.addFirst(4);

        System.out.println(list);
        
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print("null");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 6) {
                System.out.println(i);
            }
        }

        list.addFirst(2);
        list.add(8);
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.add(5, 6);
    }
}
