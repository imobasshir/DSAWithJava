package com.mobasshir.questions.arrays.binarySearch;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(perfectSquare(4));
    }

    private static boolean perfectSquare(int x) {
        int start = 0;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return true;
            } else if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
