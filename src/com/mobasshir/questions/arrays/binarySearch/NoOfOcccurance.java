package com.mobasshir.questions.arrays.binarySearch;

public class NoOfOcccurance {
    public static int binary(int[] arr, int n, int x) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == x) {
                return m;
            } else if (arr[m] < x) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }

    public static int count(int[] arr, int n, int x) {
        // code here
        // get the index of X in array
        int idx = binary(arr, n, x);

        // if X does not exist return 0;
        if (idx == -1) {
            return 0;
        }

        int count = 1;
        int left = idx - 1;
        // check left half for X
        while (left >= 0 && arr[left] == x) {
            count++;
            left--;
        }
        // check right half for X
        int right = idx + 1;
        while (right < n && arr[right] == x) {
            count++;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 7;
        int x = 3;
        int[] arr = { 2, 2, 3, 3, 3, 3, 4 };
        int ans = count(arr, n, x);
        System.out.println(x + " occurs " + ans + " times in the array.");
    }
}
