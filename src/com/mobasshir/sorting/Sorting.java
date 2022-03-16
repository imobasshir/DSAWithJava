package com.mobasshir.sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        // bubbleSort(arr);     // time complexity O(n^2)
        selectionSort(arr);     // time complexity O(n^2)
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            swap(arr, small, i);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Outter loop for pass
            for (int j = 0; j < arr.length - i - 1; j++) {
                // inner loop will run for swaping
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
