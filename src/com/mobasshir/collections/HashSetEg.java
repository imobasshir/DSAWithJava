package com.mobasshir.collections;

import java.util.HashSet;

public class HashSetEg {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            set.add(i);
        }
        System.out.println(set);
        set.add(4);
        set.add(6);
        System.out.println(set);
        set.remove(5);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(3));
        set.clear();
        System.out.println(set);
    }
}
