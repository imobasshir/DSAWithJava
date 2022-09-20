package com.mobasshir.questions.arrays.binarySearch;

public class NearlySortedBS {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 30, 20, 40, 50 };
        System.out.println(nearlySorted(arr, 50));
    }

    public static int nearlySorted(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (mid - 1 >= 0 && nums[mid - 1] == target) {
                return mid - 1;
            }
            if (mid + 1 <= nums.length - 1 && nums[mid + 1] == target) {
                return mid + 1;
            }
            if (target > nums[mid]) {
                start = mid + 2;
            } else if (target < nums[mid]) {
                end = mid - 2;
            }
        }
        return -1;
    }
}
