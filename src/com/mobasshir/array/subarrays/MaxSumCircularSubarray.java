package com.mobasshir.array.subarrays;

public class MaxSumCircularSubarray {
    public static void main(String[] args) {
        int[] arr = { 5, -3, -2, 6, -1, 4 };
        System.out.println(maxSumCircularSubarray(arr));
    }

    static int minSumSubarray(int[] arr) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            min = Math.min(min, sum);
            if (sum > 0) {
                sum = 0;
            }
        }
        return min;
    }

    static int maxSumSubarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    static int maxSumCircularSubarray(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        int maxSum = Math.max((maxSumSubarray(arr)), (arrSum - minSumSubarray(arr)));
        return maxSum;
    }
}