package com.mobasshir.questions.arrays;

public class MinCost {
    public static int minCost(String colors, int[] neededTime) {
        int res = 0, n = colors.length();
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                res += Math.min(neededTime[i], neededTime[i - 1]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String color = "aaabbbabbbb";
        int[] time = { 3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1 };
        System.out.println(minCost(color, time));
    }
}
