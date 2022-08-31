package com.mobasshir.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        int[] arr = { 5, 8, 9, 7, 1, 2, 5, 6, 4, 2, 1, 5 };
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}
