package com.mobasshir.sorting.cycleSort;

public class DuplicateNo {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-duplicate-number/
        // Find Duplicate no
        int[] arr = { 3, 5, 2, 1, 4, 5 };
        System.out.println(duplicateNumber(arr));
    }

    static int duplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIdx = arr[i] - 1;
                if (arr[i] != arr[correctIdx]) {
                    swap(arr, i, correctIdx);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
