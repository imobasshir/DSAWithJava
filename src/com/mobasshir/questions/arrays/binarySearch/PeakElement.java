package com.mobasshir.questions.arrays.binarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && mid < nums.length - 1) {
                if (nums[mid] >= nums[mid - 1] && nums[mid] >= nums[mid + 1]) {
                    return mid;
                } else if (nums[mid - 1] > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (mid == 0) {
                return nums[0] >= nums[1] ? 0 : 1;
            } else if (mid == nums.length - 1) {
                return nums[nums.length - 1] >= nums[nums.length - 2] ? nums.length - 1 : nums.length - 2;
            }
        }
        return start;
    }
}
