package com.mobasshir.stack;

import java.util.Arrays;
import java.util.Stack;

// next greater element to left
public class NGEL {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4 };
        System.out.println(Arrays.toString(ngelBrute(arr)));
        System.out.println(Arrays.toString(ngel(arr)));
    }

    private static int[] ngel(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (st.peek() >  arr[i]) {
                ans[i] = st.peek();
            } else if (st.peek() <= arr[i]) {
                while (!st.empty() && st.peek() <= arr[i]) {
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

    private static int[] ngelBrute(int[] arr) {
        int[] ngel = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ngel[0] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    ngel[i] = arr[j];
                    break;
                }
                ngel[i] = -1;
            }
        }
        return ngel;
    }
}
