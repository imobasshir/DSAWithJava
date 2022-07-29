package com.mobasshir.recursion.arrays.subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        List<Integer> list = new ArrayList<>();
        subsequences(arr, 0, 3, list);
    }

    static void subsequences(int[] arr, int i, int n, List<Integer> list) {
        if (i == n) {
            if (list.size() > 0)
                System.out.println(list);
            if (list.size() == 0)
                System.out.println("[]");
            return;
        } else {
            // picked
            subsequences(arr, i + 1, n, list);
            list.add(arr[i]);

            // not picked
            subsequences(arr, i + 1, n, list);
            list.remove(list.size() - 1);
        }
    }
}
