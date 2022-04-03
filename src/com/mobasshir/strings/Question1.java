package com.mobasshir.strings;

public class Question1 {
    public static void main(String[] args) {
        String a = "abcdefgh";
        int k = 2;
        System.out.println(reverseStr(a, k));
    }
    static String reverseStr(String s, int k) {
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            if (i < k) {
                char ch = s.charAt(i);
                str = ch + str;
            } else {
                char ch = s.charAt(i);
                str = str + ch;
            }
        }
        return str;
    }
}
