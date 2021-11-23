package com.mobasshir.searching.binarySearch;

public class LargestSum {
    public static void main(String[] args) {
        // Split Array Largest Sum
        // https://leetcode.com/problems/split-array-largest-sum/
        int[] arr = { 7, 2, 5, 10, 8 };
        int m = 2;
        int ans = splitArray(arr, m);
        System.out.println(ans);
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        // do binary search
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pices = 1;
            // calc how many pices we have to divide this with max sum
            for (int num : nums) {
                if (sum + num > mid) {
                    // we cannot add this in this sub array
                    // make new subarray
                    sum = num;
                    pices++;
                } else {
                    sum += num;
                }
            }
            if (pices > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start == end
    }
}
