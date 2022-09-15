package com.mobasshir.questions.arrays;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        System.out.println(Arrays.toString(dutchNationalFlag(nums)));
    }

    public static int[] dutchNationalFlag(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
