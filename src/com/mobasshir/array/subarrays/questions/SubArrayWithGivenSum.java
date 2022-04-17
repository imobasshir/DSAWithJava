package com.mobasshir.array.subarrays.questions;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int sum = 5;
        int[] arr = { 10, 15, -5, 15, -10, 5 };
        // int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        // int sum = 23;
        System.out.println(subArrayWithSumBrute(arr, sum));
    }

    static int subArrayWithSumBrute(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    System.out.println(i + " " + j);
                    // return 1;
                    break;
                }
            }
        }
        return 0;
    }
}
