package com.mobasshir.stack;

import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        String s = "()[{}()]";
        System.out.println(balanced(s));
        System.out.println(balanced("(){"));
        System.out.println(balanced("){}"));
        System.out.println(balanced("(){{}[]}{()"));
    }

    private static boolean balanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else  {
                if (st.isEmpty()) {
                    return false;
                } 
                if ((s.charAt(i) == ')' && st.pop() == '(') || (s.charAt(i) == ']' && st.pop() == '[') || (s.charAt(i) == '}' && st.pop() == '{')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
