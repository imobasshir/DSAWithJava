package com.mobasshir.array.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxOfSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        maxOfAllSubarryBrute(arr, 3);
        maxOfAllSubarry(arr, 3);
    }

    private static void maxOfAllSubarry(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>(arr.length - k + 1);
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k && j < arr.length; j++) {
                max = Math.max(arr[j], max);
            }
            ans.add(max);
        }
        System.out.println(ans);
    }

    private static void maxOfAllSubarryBrute(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while (j < arr.length) {
            
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + k == k) {
                
            }
        }
    }
}
