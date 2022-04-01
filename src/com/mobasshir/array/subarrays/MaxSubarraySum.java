package com.mobasshir.array.subarrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -2, 5, 7, -3, 1 };
        System.out.println(subarraySum(arr));
        System.out.println(subarraySumBruteForce(arr));
    }

    static int subarraySum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    static int subarraySumBruteForce(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        return max;
    }
}
