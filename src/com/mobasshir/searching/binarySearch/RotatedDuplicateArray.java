package com.mobasshir.searching.binarySearch;

public class RotatedDuplicateArray {
    public static void main(String[] args) {
        // Search in Rotated Duplicate Array
        int[] arr = {2,2,2,2,9};
        System.out.println(search(arr, 2));
    }
    static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicate(arr);
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
    static int findPivotWithDuplicate(int[] arr) {
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
            // if element at middle start and end are same
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // if start is pivot
                if (arr[start] > arr[start+1]) {
                    return start;
                }
                start++;

                // if end is pivot
                if (arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
