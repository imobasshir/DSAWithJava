package com.mobasshir.oops.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(8);

        list2.add(5);
        list2.add(8);
        list2.add(9);
        list2.add(6);

        System.out.println(list);
        System.out.println(list2);
    }
}
