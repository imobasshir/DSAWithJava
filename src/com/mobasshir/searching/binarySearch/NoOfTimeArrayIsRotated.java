package com.mobasshir.searching.binarySearch;

public class NoOfTimeArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = findPivot(arr) + 1;
        System.out.println(ans);
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
