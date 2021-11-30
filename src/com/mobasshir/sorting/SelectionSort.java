package com.mobasshir.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,-1,0,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find max item in the array and swap with correct index
            int lastIdx = arr.length - i - 1;
            int max = getMax(arr, 0, lastIdx);
            swap(arr, max, lastIdx);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr, int start, int last) {
        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
