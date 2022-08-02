package com.mobasshir.recursion.arrays.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumII {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        System.out.println(subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public static void helper(List<List<Integer>> res, List<Integer> ls, int[] nums, int pos) {
        res.add(new ArrayList<>(ls));
        for (int i = pos; i < nums.length; i++) {
            if (i > pos && nums[i] == nums[i - 1])
                continue;
            ls.add(nums[i]);
            helper(res, ls, nums, i + 1);
            ls.remove(ls.size() - 1);
        }
    }
}
