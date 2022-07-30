package com.mobasshir.recursion.arrays.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    // combination sum with no duplicates
    public static void main(String[] args) {
        int[] nums = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        System.out.println(findComb(nums, target));
    }

    private static List<List<Integer>> findComb(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        combination(nums, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void combination(int[] nums, int idx, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i-1]) continue;
            if (nums[i] > target) break;
            
            ds.add(nums[i]);
            combination(nums, i + 1, target - nums[i], ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
