package com.mobasshir.sorting.cycleSort;

import java.util.Arrays;

public class DuplicateError {
    public static void main(String[] args) {
        // https://leetcode.com/problems/set-mismatch/
        // Set mismatch
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return new int[] {arr[index], index+1};
            }
        }
        return new int[-1];
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
