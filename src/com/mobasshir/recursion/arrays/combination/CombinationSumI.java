package com.mobasshir.recursion.arrays.combination;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumI {
    // combination sum
    public static void main(String[] args) {
        int[] nums = { 2, 3, 6, 7 };
        int target = 7;
        System.out.println(findComb(nums, target));
    }

    private static List<List<Integer>> findComb(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinationSumI(nums, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void combinationSumI(int[] nums, int i, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (i == nums.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (nums[i] <= target) {
            ds.add(nums[i]);
            // take element and stays at that idx
            combinationSumI(nums, i, target - nums[i], ds, ans);
            ds.remove(ds.size() - 1);
        }
        // do not take element and move to next idx
        combinationSumI(nums, i + 1, target, ds, ans);
    }
}
