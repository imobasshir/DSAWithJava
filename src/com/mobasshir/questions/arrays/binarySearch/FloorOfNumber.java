package com.mobasshir.questions.arrays.binarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 8, 10, 10, 12, 19 };
        System.out.println(findFloor(arr, 5));
    }

    private static int findFloor(int[] arr, int ele) {
        int start = 0, end = arr.length - 1, res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == ele) {
                return ele;
            } else if (arr[mid] < ele) {
                // posssible candidate
                res = arr[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
