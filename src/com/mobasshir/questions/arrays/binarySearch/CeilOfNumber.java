package com.mobasshir.questions.arrays.binarySearch;

public class CeilOfNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 8, 10, 10, 12, 19 };
        System.out.println(findCeil(arr, 9));
    }

    private static int findCeil(int[] arr, int ele) {
        int start = 0, end = arr.length - 1, res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ele) {
                return ele;
            } else if (arr[mid] < ele) {
                start = mid + 1;
            } else {
                // posssible candidate
                res = arr[mid];
                end = mid - 1;
            }
        }
        return res;
    }
}
