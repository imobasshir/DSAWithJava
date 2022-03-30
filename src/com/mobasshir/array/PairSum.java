package com.mobasshir.array;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 8, 9, 14, 6 };
        int k = 17;
        // System.out.println(pairSum(arr, k));
        System.out.println(pairSumOptimized(arr, k));
    }

    static boolean pairSum(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean pairSumOptimized(int[] arr, int k) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[high] + arr[low] == k) {
                System.out.println(arr[low] + " " + arr[high]);
                return true;
            } else if (arr[low] + arr[high] > k) {
                high--;
            } else {
                low++;
            }
        }
        return false;
    }
}
