package com.mobasshir.questions.arrays;

import java.util.Arrays;

public class NextPermutaion {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 4, 2 };
        nextPermutaion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPermutaion(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = arr.length - 1;
            while (j >= 0 && arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
    }

    private static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
