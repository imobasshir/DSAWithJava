package com.mobasshir.array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements to array list
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // get element to array list
        System.out.println(list.get(2));

        // to add element in b/w
        list.add(1, 1);
        System.out.println(list);

        // set element or change element at some index
        list.set(3, 4);
        System.out.println(list);

        // to delete element at some index
        list.remove(3);
        System.out.println(list);

        // size of array list
        System.out.println(list.size());

        // iterate over array list
        // using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // using foreach loop
        for (Integer i : list) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.add(5);
        list.add(4);
        list.add(0);
        list.add(3);
        System.out.println(list);

        // sorting in arraylist
        Collections.sort(list);
        System.out.println(list);
    }
}
