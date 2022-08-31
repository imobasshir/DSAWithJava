package com.mobasshir.collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = { 1, 4, 5, 8, 9, 7 };
        for (int i : arr) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop()+ " ");
        }
        System.out.println();
        stack.push(4);
        stack.push(0);
        System.out.println(stack.peek());
    }
}
