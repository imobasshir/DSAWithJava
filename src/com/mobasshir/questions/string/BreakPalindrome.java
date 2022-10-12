package com.mobasshir.questions.string;

public class BreakPalindrome {
    public static void main(String[] args) {
        System.out.println(breakPalindrome("aaaaa"));
    }

    public static String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1)
            return "";
        char[] ch = palindrome.toCharArray();
        for (int i = 0; i < n; i++) {
            if (n % 2 == 1 && i == n / 2)
                continue;
            if (ch[i] == 'a')
                continue;
            ch[i] = 'a';
            return String.valueOf(ch);
        }
        ch[n - 1] = 'b';
        return String.valueOf(ch);
        // return "";
    }
}
