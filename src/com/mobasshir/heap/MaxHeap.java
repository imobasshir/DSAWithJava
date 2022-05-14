package com.mobasshir.heap;

import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 6; i++) {
            arr[0] = 50;
            arr[1] = 30;
            arr[2] = 40;
            arr[3] = 10;
            arr[4] = 5;
            arr[5] = 20;
        }
        int value = 60;
        int n = 6;
        add(arr, n, value);
        System.out.println(Arrays.toString(arr));
    }

    private static void add(int[] arr, int n, int value) {
        n = n + 1;
        arr[n - 1] = value;
        int i = n - 1;
        while (i > 0) {
            int parent = (n - 1) / 2;
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
