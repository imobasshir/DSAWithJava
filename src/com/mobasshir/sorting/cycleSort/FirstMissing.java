package com.mobasshir.sorting.cycleSort;

public class FirstMissing {
    public static void main(String[] args) {
        // https://leetcode.com/problems/first-missing-positive/
        // First Missing Positive
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIdx]) {
                swap(arr, i, correctIdx);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return index+1;
            }
        }
        return arr.length+1;
    }
}
