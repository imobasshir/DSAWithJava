package com.mobasshir.questions;

import java.util.Arrays;

public class SufulleArr {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2 };
        int n = 2;
        int[] ans = shuffle(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] arr, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                ans[i] = arr[i / 2];
            } else {
                ans[i] = arr[n + i / 2];
            }
        }
        return ans;
    }
}
