package com.mobasshir.questions.arrays;

import java.util.Arrays;

public class SmallerThan {
    // https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
    // How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] arr = { 7, 2, 4, 9, 1 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] minValArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            // int j = nums.length - 1;
            // while (j >= 0) {
            // if (nums[i] > nums[j]) {
            // counter++;
            // }
            // j--;
            // }
            minValArr[i] = count;
        }
        return minValArr;
    }
}
