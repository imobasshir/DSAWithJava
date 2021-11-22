package com.mobasshir.searching.binarySearch;

public class RotatedArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/search-in-rotated-sorted-array/
        // Search in Rotated Sorted Array
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 7));
    }
    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        // if pivot is not found then array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        } 
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // int mid = (start + end) / 2;
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
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
