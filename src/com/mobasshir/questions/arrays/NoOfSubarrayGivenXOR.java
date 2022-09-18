package com.mobasshir.questions.arrays;

import java.util.HashMap;
import java.util.Map;

public class NoOfSubarrayGivenXOR {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        int m = 6;
        System.out.println(ans(arr, m));
        System.out.println(solution(arr, m));
    }

    public static int ans(int[] arr, int m) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == m) count++;
            }
        }
        return count;
    }

    public static int solution(int[] arr, int m) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0, xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            if (freq.containsKey(xor ^ m)) {
                count += freq.get(xor ^ m);
            }
            if (xor == m) {
                count++;
            }
            freq.put(xor, freq.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
