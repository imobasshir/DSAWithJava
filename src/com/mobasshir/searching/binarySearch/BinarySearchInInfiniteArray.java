package com.mobasshir.searching.binarySearch;

public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
        int[] arr = { 2, 3, 4, 5, 6, 7, 9, 11, 15, 17, 19, 27, 30, 35 };
        int target = 30;
        System.out.println(findRange(arr, target));
    }

    static int findRange(int[] arr, int target) {
        // find range with firstly
        // find start with box of size 2
        int start = 0;
        int end = 1;

        // condition for target is present in range
        // is when target is less than end
        while (target > arr[end]) {
            int newStart = end + 1;
            // new end = (end + double size) of box which it was
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
