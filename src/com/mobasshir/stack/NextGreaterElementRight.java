package com.mobasshir.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementRight {
    public static void main(String[] args) {
        int[] arr = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };

        System.out.println(Arrays.toString(ngerBruteForce(arr)));
        System.out.println(Arrays.toString(nger(arr)));
        System.out.println(Arrays.toString(nger1(arr)));
    }

    static int[] ngerBruteForce(int[] arr) {
        int[] nger = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nger[i] = arr[j];
                    break;
                }
                nger[i] = -1;
            }
        }
        return nger;
    }

    static int[] nger(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int nger[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!st.empty()) {
                while (!st.empty() && st.peek() <= arr[i]) {
                    st.pop();
                }
            }
            nger[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return nger;
    }


    static int[] nger1(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int nger[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                nger[i] = -1;
            } else if (st.peek() >  arr[i]) {
                nger[i] = st.peek();
            } else if (st.peek() <= arr[i]) {
                while (!st.empty() && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    nger[i] = -1;
                } else {
                    nger[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return nger;
    }
}
