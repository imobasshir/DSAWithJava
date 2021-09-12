package com.mobasshir.searching.linearSearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evenNoOfDigit {
    public static void main(String[] args) {
        int[] nums = {12,345,2,66,7896,-666};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {          // to check no of digit in that number is even or not
        if ((noOfDigit(num) % 2) == 0) {
            return true;
        }
        return false;
    }
    static int digit(int num) {
        if (num < 0) {
            num = num * -1;
        } 
        return (int)(Math.log10(num)) + 1;
    }
    static int noOfDigit(int num) {         // to check no of digits in that number
        if (num < 0) {
            num = num * -1;
        } 
        if (num == 0) {
            return 1;
        }       
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
