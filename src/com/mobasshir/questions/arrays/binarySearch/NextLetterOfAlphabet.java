package com.mobasshir.questions.arrays.binarySearch;

public class NextLetterOfAlphabet {
    public static void main(String[] args) {
        char[] arr = { 'a', 'c', 'f', 'h' };
        // char ans = nextLetter(arr, 'b'); // ans = c
        // char ans = nextLetter(arr, 'd'); // ans = f
        char ans = nextLetter(arr, 'f'); // ans = h
        System.out.println(ans);
    }

    private static char nextLetter(char[] arr, char target) {
        int start = 0, end = arr.length - 1;
        char res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                res = arr[mid];
                end = mid - 1;
            }
        }
        return res;
    }
}
