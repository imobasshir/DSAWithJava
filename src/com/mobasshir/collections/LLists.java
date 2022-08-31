package com.mobasshir.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLists {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(list.size(), 5);
        list.add(0, 0);
        System.out.println(list.equals(list));

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        System.out.println(list.getClass());

        System.out.println(list.get(5));

        list.clear();
        System.out.println(list);
    }
}
