package com.mobasshir.recursion.arrays.subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        List<Integer> list = new ArrayList<>();
        subsequences(arr, 0, 3, list);
        System.out.println(ans);
    }

    static void subsequences(int[] arr, int i, int n, List<Integer> list) {
        if (i == n) {
            if (list.size() > 0)
                ans.add(new ArrayList<>(list));
            // System.out.println(list);
            if (list.size() == 0)
                ans.add(new ArrayList<>());
            // System.out.println("[]");
            return;
        } else {
            // picked
            list.add(arr[i]);
            subsequences(arr, i + 1, n, list);

            // not picked
            list.remove(list.size() - 1);
            subsequences(arr, i + 1, n, list);
        }
    }
}
