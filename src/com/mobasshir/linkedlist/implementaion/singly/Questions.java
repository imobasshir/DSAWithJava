package com.mobasshir.linkedlist.implementaion.singly;

public class Questions {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode duplicate(ListNode head) {
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    // public ListNode mergeTwo(ListNode list1, ListNode list2) {
        // ListNode f = list1.head;
        // ListNode s = list2.head;

        // while (f != null && s != null) {
            
        // }
    // }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public ListNode findMid(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (first.next != null && first.next.next != null) {
            first = first.next.next;
            second = second.next;
        }
        return second;
    }
    
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; 
        }
        // middle element of linked list is end + 1 of first half
        ListNode mid = findMid(head);
        ListNode secSrt = reverse(mid.next);
        
        ListNode fstSrt = head;
        while (secSrt != null) {
            if (fstSrt.val != secSrt.val) {
                return false;
            }
            fstSrt = fstSrt.next;
            secSrt = secSrt.next;
        }
        return true;
    }
    
    public static void main(String[] args) {

    }
}
