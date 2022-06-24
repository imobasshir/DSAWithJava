package com.mobasshir.array.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoOfAnagram {
    // Count no of anagram present in a string s
    public static void main(String[] args) {
        String s = "aabaabaabaa";
        String ptr = "aaba";
        System.out.println(anagram(s, ptr));
        // System.out.println(anagramCt(s, ptr));
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

    static int anagramCt(String s, String ptr) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> ptrmap = new HashMap<>();

        // Store all the pattern value in map
        for (int l = 0; l < ptr.length(); l++) {
            ptrmap.put(ptr.charAt(l), ptrmap.getOrDefault(ptr.charAt(l), 0) + 1);
        }

        // Store all the s value of value size in map
        for (int l = 0; l < ptr.length(); l++) {
            smap.put(s.charAt(l), smap.getOrDefault(s.charAt(l), 0) + 1);
        }

        int i = 0;
        int j = ptr.length();
        int count = 0;
        while (j < s.length()) {
            if (compare(ptrmap, smap) == true) {
                count++;
            }

            smap.put(s.charAt(j), smap.getOrDefault(s.charAt(j), 0) + 1);

            if (smap.get(s.charAt(i)) == 1) { 
                smap.remove(s.charAt(i));
            } else {
                smap.put(s.charAt(i), smap.get(s.charAt(i)) - 1);
            }
        }
        if (compare(ptrmap, smap) == true) {
            count++;
        }

        return count;
    }

    static boolean compare(Map<Character, Integer> mapA, Map<Character, Integer> mapB) {
        // for (char sch : smap.keySet()) {
        //     if (ptrmap.getOrDefault(sch, 0) != smap.get(sch)) {
        //         return false;
        //     }
        // }

        // for (char k : mapB.keySet())
        // {
        //     if (!mapA.get(k).equals(mapB.get(k))) {
        //         return false;
        //     }
        // } 
        // for (char y : mapA.keySet())
        // {
        //     if (!mapB.containsKey(y)) {
        //         return false;
        //     }
        // } 
        boolean b = mapA.entrySet().stream().filter(value -> mapB.entrySet().stream().anyMatch(value1 -> (value1.getKey() == value.getKey() && value1.getValue() == value.getValue()))).findAny().isPresent();
        return b;
    }
}
