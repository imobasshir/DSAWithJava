package com.mobasshir.array.subarrays.questions;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int sum = 5;
        int[] arr = { 10, 15, -5, 15, -10, 5 };
        // int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        // int sum = 23;
        // System.out.println(subArrayWithSumBrute(arr, sum));
        System.out.println(subArrayWithSumOp(arr, sum));
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

    static int subArrayWithSumOp(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        int start = 0;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum - sum)) {
                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum, i);
        }
        if (end == -1) {
            return -1;
        } else {
            System.out.println(start + " " + end);
        }
        return 0;
    }
}
