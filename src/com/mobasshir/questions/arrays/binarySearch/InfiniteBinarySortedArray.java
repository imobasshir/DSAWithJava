package com.mobasshir.questions.arrays.binarySearch;

public class InfiniteBinarySortedArray {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        System.out.println(infiniteBinarySortedBS(arr));
    }

    private static int infiniteBinarySortedBS(int[] arr) {
        int start = 0, end = 1;
        while (arr[end] != 1) {
            start = end;
            end *= 2;
        }
        return binarySearchZeroOne(arr, start, end);
    }

    private static int binarySearchZeroOne(int[] arr, int start, int end) {
        int target = 1, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
