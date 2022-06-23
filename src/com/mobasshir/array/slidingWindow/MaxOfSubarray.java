package com.mobasshir.array.slidingWindow;

public class MaxOfSubarray {
    public static void main(String[] args) {
        // Find max sum of subarray of size n
        int[] arr = { 2, 3, 5, 2, 9, 7, 1 };
        int n = 3;

        // Brute Force
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < i + n && (j < arr.length); j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
