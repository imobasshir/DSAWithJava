package com.mobasshir.sorting.cycleSort;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicate {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-all-duplicates-in-an-array/
        // All duplicate
        int[] nums = { 4, 3, 2, 7, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }
}
