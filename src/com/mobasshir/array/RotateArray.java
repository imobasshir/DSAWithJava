package com.mobasshir.array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(arr));
        int k = 3;
        rotate(arr, k, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int k, int n) {
        k = k % n;
        // right rotate
        // reverse part2
        // reverse(arr, n - k, n - 1);
        // // reverse part1
        // reverse(arr, 0, n - k - 1);
        // // reverse whole array
        // reverse(arr, 0, n - 1);

        // left rotate
        reverse(arr, k, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

// Approach
/**
 * We have to divide an array in two parts about the index which we
 * have to rotate an array then reverse 1st part then reverse 2nd part then
 * reverse whole array at a time.
 */
