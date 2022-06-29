package com.mobasshir.stack;

import java.util.Arrays;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int[] arr = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[arr.length];
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            // if (!st.empty()) {
            //     while (!st.empty() && st.peek() <= arr[i % arr.length]) {
            //         st.pop();
            //     }
            // }
            // nge[i % arr.length] = st.empty() ? -1 : st.peek();
            // st.push(arr[i % arr.length]);
            if (st.isEmpty()) {
                nge[i % arr.length] = -1;
            } else if (st.peek() >  arr[i % arr.length]) {
                nge[i % arr.length] = st.peek();
            } else if (st.peek() <= arr[i % arr.length]) {
                while (!st.empty() && st.peek() <= arr[i % arr.length]) {
                    st.pop();
                }

                // nge[i % arr.length] = st.empty() ? -1 : st.peek();
                if (st.isEmpty()) {
                    nge[i % arr.length] = -1;
                } else {
                    nge[i % arr.length] = st.peek();
                }
            }
            st.push(arr[i % arr.length]);
        }
        System.out.println(Arrays.toString(nge));
    }
}
