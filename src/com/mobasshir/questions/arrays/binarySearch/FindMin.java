package com.mobasshir.questions.arrays.binarySearch;

public class FindMin {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        // if there is only a element
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;

        // if array is already sorted
        if (nums[right] > nums[0]) {
            return nums[0];
        }

        // else apply the logic of binary search
        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
