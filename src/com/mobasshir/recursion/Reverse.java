package com.mobasshir.recursion;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return;
        }
        swap(arr, i, (arr.length - i - 1));
        reverse(arr, i + 1);
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
