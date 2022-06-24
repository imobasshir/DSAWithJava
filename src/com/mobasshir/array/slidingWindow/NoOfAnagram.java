package com.mobasshir.array.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoOfAnagram {
    // Count no of anagram present in a string s
    public static void main(String[] args) {
        String s = "aabaabaabaa";
        String ptr = "aaba";
        System.out.println(anagram(s, ptr));
    }

    static int anagram(String s, String ptr) {
        Map<Character, Integer> map = new HashMap<>();
        for (int l = 0; l < ptr.length(); l++) {
            map.put(ptr.charAt(l), map.getOrDefault(ptr.charAt(l), 0) + 1);
        }

        int k = ptr.length();
        int i = 0;
        int j = 0;
        int count = map.size();
        int occurences = 0;

        while (j < s.length()) {
            char temp = s.charAt(j);
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) - 1);
                if (map.get(temp) == 0) {
                    count--;
                }
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (count == 0) {
                    occurences++;
                }
                char x = s.charAt(i);
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                    if (map.get(x) == 1) {
                        count++;
                    }
                    i++;
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
        }
        return occurences;
    }
}
