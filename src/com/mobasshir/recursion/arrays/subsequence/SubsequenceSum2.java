package com.mobasshir.recursion.arrays.subsequence;

public class SubsequenceSum2 {
    // count no subsequence that have desired result
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        System.out.println(subsequences(arr, 0, 0, 2));
    }

    static int subsequences(int[] arr, int i, int sum, int target) {
        if (i == arr.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        } else {
            // picked
            int l = subsequences(arr, i + 1, sum, target);
            sum += arr[i];
            // not-picked
            int r = subsequences(arr, i + 1, sum, target);
            sum -= arr[i];

            return l + r;
        }
    }
}
