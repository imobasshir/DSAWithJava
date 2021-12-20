package com.mobasshir.questions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcat {
    // https://leetcode.com/problems/concatenation-of-array/
    // Concatenation of Array
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length]; // Creation of duplicate of nums arr
        for (int index = 0; index < nums.length; index++) {
            arr[index] = nums[index];
            arr[index + nums.length] = nums[index];
        }
        return arr;
    }
}
