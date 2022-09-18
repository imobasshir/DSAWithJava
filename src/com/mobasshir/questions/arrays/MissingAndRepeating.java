package com.mobasshir.questions.arrays;

import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        ans(arr);
        getTwoElements(arr, arr.length);
    }

    public static void ans(int[] arr) {
        int[] freq = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                System.out.println("Duplicate: " + i);
            }
            if (freq[i] == 0) {
                System.out.println("Missing: " + i);
            }
        }
    }

    public static void getTwoElements(int arr[], int n) {
        /*
         * Will hold xor of all elements
         * and numbers from 1 to n
         */
        int xor1;

        /* Will have only single set bit of xor1 */
        int set_bit_no;

        int x = 0, y = 0;

        xor1 = arr[0];

        /* Get the xor of all array elements */
        for (int i = 1; i < n; i++)
            xor1 = xor1 ^ arr[i];

        /*
         * XOR the previous result with numbers from
         * 1 to n
         */
        for (int i = 1; i <= n; i++)
            xor1 = xor1 ^ i;

        /* Get the rightmost set bit in set_bit_no */
        set_bit_no = xor1 & ~(xor1 - 1);

        /*
         * Now divide elements into two sets by comparing
         * rightmost set bit of xor1 with the bit at the same
         * position in each element. Also, get XORs of two
         * sets. The two XORs are the output elements. The
         * following two for loops serve the purpose
         */
        for (int i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0) {
                /* arr[i] belongs to first set */
                x = x ^ arr[i];
            } else {
                /* arr[i] belongs to second set */
                y = y ^ arr[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & set_bit_no) != 0) {
                /* i belongs to first set */
                x = x ^ i;
            } else {
                /* i belongs to second set */
                y = y ^ i;
            }
        }

        // at last do a linear check which amont x and y is missing or repeating

        /* *x and *y hold the desired output elements */
        System.out.println(x);
        System.out.println(y);
    }
}
