package com.mobasshir.stack;

import java.util.Arrays;

public class NextGreaterElementRight {
    public static void main(String[] args) {
        int[] arr = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };
        int[] nger = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nger[i] = arr[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nger));
    }
}
