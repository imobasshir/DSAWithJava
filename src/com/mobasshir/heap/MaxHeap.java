package com.mobasshir.heap;

import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[1] = 50;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 10;
        arr[5] = 5;
        arr[6] = 20;
        int value = 60;
        int n = 6;
        delete(arr, n);
        // add(arr, n, value);
        System.out.println(Arrays.toString(arr));

    }

    private static void delete(int[] arr, int n) {
        arr[1] = arr[n];
        n = n - 1;
        int i = 1;
        while (i < n) {
            int left = arr[2 * i];
            int right = arr[2 * i] + 1;
            int large = left > right ? 2 * i : 2 * i + 1;
            if (arr[i] < arr[large]) {
                swap(arr, large, i);
                i = large;
            } else {
                return;
            }
        }
    }

    private static void add(int[] arr, int n, int value) {
        n = n + 1;
        arr[n] = value;
        int i = n;
        while (i > 0) {
            int parent = (n) / 2;
            if (arr[i] > arr[parent]) {
                swap(arr, parent, i);
                i = parent;
            } else {
                return;
            }
        }
    }

    private static void swap(int[] arr, int parent, int i) {
        int temp = arr[parent];
        arr[parent] = arr[i];
        arr[i] = temp;
    }
}
