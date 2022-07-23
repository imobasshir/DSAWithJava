package com.mobasshir.recursion.arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9, 12 };
        System.out.println(sorted(arr, 0));
    }

    private static boolean sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && sorted(arr, i + 1);
    }
}
