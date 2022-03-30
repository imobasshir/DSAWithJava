package com.mobasshir.array;

public class Subarrays {
    public static void main(String[] args) {
        int[] arr = { -1, 4, 7, 2 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.println();
            }
        }
    }
}
