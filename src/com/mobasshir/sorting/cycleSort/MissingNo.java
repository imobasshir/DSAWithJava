package com.mobasshir.sorting.cycleSort;

public class MissingNo {
    public static void main(String[] args) {
        // Missing Number
        // https://leetcode.com/problems/missing-number/
        int[] arr = {1,3,4,0};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
