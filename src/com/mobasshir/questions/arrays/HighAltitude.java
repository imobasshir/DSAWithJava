package com.mobasshir.questions.arrays;

public class HighAltitude {
    // https://leetcode.com/problems/find-the-highest-altitude/
    // Find the Highest Altitude
    public static void main(String[] args) {
        // int[] gain = { -5, 1, 5, 0, -7 };
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    static int largestAltitude(int[] gain) {
        int gainInAltitude = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            gainInAltitude += gain[i]; // For altitude gain
            max = Math.max(max, gainInAltitude); // Max b/w altitude gain and max
        }
        return max;
    }
}
