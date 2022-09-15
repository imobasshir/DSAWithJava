package com.mobasshir.questions.arrays;

public class MooresVoating {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 3, 2 };
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int value = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                value = nums[i];
            }
            if (value == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return value;
    }
}
