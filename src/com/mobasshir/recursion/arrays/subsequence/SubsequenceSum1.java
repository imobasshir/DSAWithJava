package com.mobasshir.recursion.arrays.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum1 {
    // print a subsequence that have desired result
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        List<Integer> list = new ArrayList<>();
        subsequences(arr, 0, list, 0, 2);
    }

    static boolean subsequences(int[] arr, int i, List<Integer> list, int sum, int target) {
        if (i == arr.length) {
            if (sum == target) {
                System.out.println(list);
                return true;
            }
            return false;
        } else {
            // picked
            if (subsequences(arr, i + 1, list, sum, target) == true)
                return true; 
            list.add(arr[i]);
            sum += arr[i];
            // not-picked
            if (subsequences(arr, i + 1, list, sum, target) == true)
                return true; 
            list.remove(list.size() - 1);
            sum -= arr[i];
            return false;
        }
    }
}
