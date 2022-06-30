package com.mobasshir.stack;

import java.util.Arrays;
import java.util.Stack;

public class NSL {
    // next smaller left
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        System.out.println(Arrays.toString(nselBrute(arr)));
        System.out.println(Arrays.toString(nsel(arr)));
    }

    private static int[] nsel(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (st.peek() <  arr[i]) {
                ans[i] = st.peek();
            } else if (st.peek() >= arr[i]) {
                while (!st.empty() && st.peek() >= arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }

    private static int[] nselBrute(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[0] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    ans[i] = arr[j];
                    break;
                }
                ans[i] = -1;
            }
        }
        return ans;
    }
}
