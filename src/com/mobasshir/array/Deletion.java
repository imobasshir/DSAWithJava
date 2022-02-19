package com.mobasshir.array;

import java.util.Arrays;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("Array is: " + Arrays.toString(arr));

        // Deletion at starting idx
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            arr[i - 1] = arr[i];
        }
        len--;
        System.out.println("Updated array is: " + Arrays.toString(arr));

        // Delete element of 3rd idx
        for (int i = 4; i < len; i++) {
            arr[i-1] = arr[i];
        }
        len--;
        System.out.println("Updated array is: " + Arrays.toString(arr));
    }
}
