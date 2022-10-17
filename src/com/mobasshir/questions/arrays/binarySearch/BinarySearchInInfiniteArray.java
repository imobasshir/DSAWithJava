package com.mobasshir.questions.arrays.binarySearch;

public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
        System.out.println(infiniteBS(arr, 14));
    }

    private static int infiniteBS(int[] arr, int target) {
        int start = 0, end = 1;
        while (arr[end] < target) {
            start = end;
            end *= 2;
        }
        return binarySearch(arr, start, end, target);
    }

    private static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
}
