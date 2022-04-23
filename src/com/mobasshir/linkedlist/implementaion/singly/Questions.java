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
    public static void main(String[] args) {

    }
}
