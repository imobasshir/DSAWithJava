package com.mobasshir.recursion;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        // int[] arr = { 1, 2, 3, 4 };
        System.out.println(palindrome(arr, 0));
    }

    static boolean palindrome(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return true;
        }
        if (arr[i] != arr[arr.length - i - 1])
            return false;
        return palindrome(arr, i + 1);
    }
}
