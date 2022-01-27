package com.mobasshir.oops.collection;

import java.util.List;
import java.util.Vector;

public class VectorEg {
    public static void main(String[] args) {
        // Vector syncronized which means if a thread access the vector another thread
        // should have to wait for it to complete so it is slower than ArrayList
        List<Integer> list = new Vector<>();

        list.add(8);
        list.add(3);
        list.add(5);
        list.add(2);

        System.out.println(list);
    }
}
