package com.mobasshir.questions;

import java.util.Arrays;

public class RunningSum {
    // https://leetcode.com/problems/running-sum-of-1d-array/
    // Running Sum of 1d Array
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];           // Firstly we create a duplicate array which will store sum
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }
}
