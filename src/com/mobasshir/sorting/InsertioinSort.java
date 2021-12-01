package com.mobasshir.sorting;

import java.util.Arrays;

public class InsertioinSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2, -5, 0 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
