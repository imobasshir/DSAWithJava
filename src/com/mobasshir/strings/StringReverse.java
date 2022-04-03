package com.mobasshir.strings;

public class StringReverse {
    public static void main(String[] args) {
        String str = "hello";
        reverse(str);
        reverse1(str);
    }

    static void reverse(String str) {
        // take new empty string which will store the reversed of string
        String newStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            // take character at every index and append it to start of new empty string so
            // that we can reverse string by placing character in the revese order
            ch = str.charAt(i);
            // append character at start of new string which will be the reversed form of
            // string
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }

    static void reverse1(String str) {
        char[] s = str.toCharArray();
        int start = 0;
        int end = s.length - 1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(s);
    }
}
