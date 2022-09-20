package com.mobasshir.questions.arrays.binarySearch;

public class NoOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 10, 3, 6 };
        int ans = arr.length - findPivot(arr);
        System.out.println(ans);
    }

    public static int findPivot(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] <= arr[low] && arr[mid] <= arr[high])
                return mid;

            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
