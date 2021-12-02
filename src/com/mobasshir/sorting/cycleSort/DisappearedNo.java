package com.mobasshir.sorting.cycleSort;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNo {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
        // Find All Numbers Disappeared in an Array
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx);
            } else {
                i++;
            }
        }
        // find missingno
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index+1);
            }
        }
        return ans;
    }
}
