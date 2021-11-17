package com.mobasshir.searching.binarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // Ceiling of a number means number greater than or equal to target element.
    // return => index greater than equal to target.

    // if target is greater than greatest element in array => return element not
    // found.
    static int ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
