package com.mobasshir.recursion.arrays.permutaions;

import java.util.ArrayList;
import java.util.List;

public class PermutaionsI {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutaions(nums, ds, ans, freq);
        return ans;
    }

    public static void permutaions(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                // going inside recursion
                freq[i] = true;
                ds.add(nums[i]);
                permutaions(nums, ds, ans, freq);
                // coming out of recursion
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }

    }
}
