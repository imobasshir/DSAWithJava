package com.mobasshir.questions.string;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String ans = "";
        char ch;
        int n = s.length();
        int i = 0;
        while (n > 0) {
            if (s.charAt(i) != ' ') {
                ch = s.charAt(i);
                ans = ch + ans;
            } 
            n--;
            i++;
        }
        
        return ans;
    }
}
