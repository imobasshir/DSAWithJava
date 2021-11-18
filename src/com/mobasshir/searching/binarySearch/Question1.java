package com.mobasshir.searching.binarySearch;

public class Question1 {
    public static void main(String[] args) {
        // Find Smallest Letter Greater Than Target
        // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';
        int ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        // int start = 0;
        // int end = letters.length - 1;
        // while (start <= end) {
        //     int mid = start + (end - start) / 2;
        //     if (target > letters[mid]) {
        //         start = mid + 1;
        //     } else {
        //         end = mid - 1;
        //     }
        // }
        // return letters[start % letters.length];
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}