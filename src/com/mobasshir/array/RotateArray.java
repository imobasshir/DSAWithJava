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
        // start = 0;
        // end = arr.length - 1;
        // while (start < end) {
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
