package com.mobasshir.stack;

import java.util.Arrays;
import java.util.Stack;

public class NSR {
    // next smaller right
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        System.out.println(Arrays.toString(nserBrute(arr)));
        System.out.println(Arrays.toString(nser(arr)));
    }

    private static int[] nser(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
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

    private static int[] nserBrute(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
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
