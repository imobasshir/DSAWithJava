package com.mobasshir.searching.binarySearch;

public class MountainArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/peak-index-in-a-mountain-array/
        // Peak Index in a Mountain Array
        int[] arr = {1,2,3,4,5,3,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
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
}
