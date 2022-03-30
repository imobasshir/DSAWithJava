package com.mobasshir.array.subarrays;

public class MaxProduct {
    public static void main(String[] args) {
        // int[] arr = { 2, 5, -9, 8, 6, 0, 4 };
        int[] arr = { 2, 8, -4, 6, 2, 9, 3 };
        System.out.println(maxProduct(arr));
    }

    static int maxProduct(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currentProd = 1;
            for (int j = i; j < arr.length; j++) {
                currentProd *= arr[j];
                if (currentProd > max) {
                    max = currentProd;
                }
            }
        }
        return max;
    }
}
