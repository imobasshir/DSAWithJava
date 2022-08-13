package com.mobasshir.recursion.arrays;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, res);
        return res;
    }
    
    static void func(int idx, String s, List<String> path, List<List<String>> res) {
        if(idx == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = idx; i < s.length(); i++) {
            if(isPalindrome(s, idx, i)) {
                path.add(s.substring(idx, i+1));
                func(i+1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    
    static boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--)) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(partition(s));
    }
}
