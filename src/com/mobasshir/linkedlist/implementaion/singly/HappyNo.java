package com.mobasshir.linkedlist.implementaion.singly;

public class HappyNo {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSq(slow);
            fast = findSq(findSq(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    public static int findSq(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
