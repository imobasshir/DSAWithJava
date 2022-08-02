package com.mobasshir.recursion.arrays.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        System.out.println(combinationSum2(arr, 8));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void combination(int[] nums, int i, int target, List<Integer> ds, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1])
                continue;
            if (nums[j] > target)
                break;

            ds.add(nums[j]);
            combination(nums, j + 1, target - nums[j], ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}
