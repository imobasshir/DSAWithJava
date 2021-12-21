package com.mobasshir.questions.arrays;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    // Kids With the Greatest Number of Candies
    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandy) {
                maxCandy = candies[i];
            }
        }
        List<Boolean> answer = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            answer.add(candies[i] + extraCandies >= maxCandy);
        }
        return answer;
    }
}
