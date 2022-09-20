package com.mobasshir.questions.arrays.binarySearch;

public class FindSingleElementOccur {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(bruteForce(arr));
        System.out.println(optimized(arr));
    }

    private static int bruteForce(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans ^= arr[i];
        }
        return ans;
    }

    private static int optimized(int[] arr) {
        int start = 0, end = arr.length - 2;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (arr[mid] == arr[mid ^ 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
