package com.mobasshir.searching.binarySearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-in-mountain-array/
        // Find in Mountain Array
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAganosticSearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAganosticSearch(arr, target, peak+1, arr.length-1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // this may be the answer but check in left
                // because mid > mid + 1
                end = mid;
            } else {
                // because mid < mid + 1
                start = mid + 1;
            }
        }
        // in the end start == end after two checks
        // start and end is there to find the max element
        // so, when they point at a place that is max no
        return start; // we can return end also
    }

    static int orderAganosticSearch(int[] arr, int target, int start, int end) {
        // find the order of sorted array
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
