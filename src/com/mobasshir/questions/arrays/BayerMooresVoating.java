package com.mobasshir.questions.arrays;

import java.util.ArrayList;
import java.util.List;

public class BayerMooresVoating {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == num1) {
                count1++;
            } else if (nums[i] == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                num2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == num1)
                count3++;
            else if (nums[i] == num2)
                count4++;
        }
        if (count3 > n / 3)
            list.add(num1);
        if (count4 > n / 3)
            list.add(num2);
        return list;
    }
}
