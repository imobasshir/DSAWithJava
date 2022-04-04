package com.mobasshir.array.subarrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 8,0, 6, 0, 4 };
        // int[] arr = { 2, 8, -4, 6, 2, 9, 3 };
        System.out.println(maxProduct(arr));
        System.out.println(maxProductOp(arr));
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

    static int maxProductOp(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                max = 1;
                min = 1;
                continue;
            }
            if (arr[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr[i], max*arr[i]);
            min = Math.min(arr[i], min*arr[i]);
            ans = Math.max(max, ans);
        }
        return ans;
    }
}
