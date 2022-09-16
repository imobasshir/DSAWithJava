package com.mobasshir.questions.arrays;

public class KadaneMulAlgo {
    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int lastMin = nums[0];
        int lastMax = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int min = Math.min(nums[i], Math.min(lastMin * nums[i], lastMax * nums[i]));
            int max = Math.max(nums[i], Math.max(lastMin * nums[i], lastMax * nums[i]));
            ans = Math.max(ans, max);
            lastMin = min;
            lastMax = max;
        }
        return ans;
    }
}
