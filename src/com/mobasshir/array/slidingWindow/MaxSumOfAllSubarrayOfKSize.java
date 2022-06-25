package com.mobasshir.array.slidingWindow;

public class MaxSumOfAllSubarrayOfKSize {
    public static void main(String[] args) {
        // Find max sum of subarray of size n
        int[] arr = { 2, 3, 5, 2, 9, 7, 1 };
        int n = 3;

        System.out.println(bruteForce(arr, n));
        System.out.println(bruteForceMin(arr, n));
        System.out.println(usingSlidingWindow(arr, n));
    }

    static int bruteForce(int[] arr, int k) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < i + k && (j < arr.length); j++) {
                sum += arr[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    static int bruteForceMin(int[] arr, int k) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < i + k && (j < arr.length); j++) {
                sum += arr[j];
            }
            min = Math.min(sum, min);
        }
        return min;
    }

    static int usingSlidingWindow(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        int sum = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                max = Math.max(sum, max);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
