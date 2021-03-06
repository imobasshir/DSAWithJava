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

    public void mergeTwo(ListNode list1, ListNode list2) {
        ListNode f = list1;
        ListNode s = list2;

        while (f != null && s != null) {
        }
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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

    public ListNode merge1(ListNode head) {
        ListNode fst = head;
        ListNode mid = findMid(head);
        ListNode sec = reverse(mid.next);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (true) {
            if (fst == null) {
                temp.next = sec;
                break;
            }
            if (sec == null) {
                temp.next = fst;
                break;
            }
            if (fst.val >= sec.val) {
                temp.next = sec;
                sec = sec.next;
            } else {
                temp.next = fst;
                fst = fst.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }

    public void reorder(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode mid = findMid(head);
        ListNode second = reverse(mid);
        ListNode first = head;
        while (first != null && second != null) {
            ListNode temp = first.next;
            first.next = second;
            first = temp;
            temp = second.next;
            second.next = first;
            second = temp;
        }
        if (first != null)
            first.next = null;
    }

    public static void main(String[] args) {

    }
}
