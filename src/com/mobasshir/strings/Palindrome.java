package com.mobasshir.strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba"));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end)
                return false;
        }
        return true;
    }
}
