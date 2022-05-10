package com.mobasshir.linkedlist.implementaion.singly;

public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL() {
        this.size = 0;
    }
    
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // size
    public int getSize() {
        return size + 1;
    }

    // print linkedlist
    public void display() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // insertion at start of linkedlist
    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;

        size++;
    }

    // inserion at end of linkedlist
    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

        size++;
    }

    // insertion at any index
    public void insert(int value, int index) {
        Node node = new Node(value);
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        node.next = temp.next;
        temp.next = node;
        

        size++;
    }

    // delete at start in linkedlist
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // deletion at last of linkedlist
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // delete at any point
    public void delete(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }
        size--;
        Node temp = head;
        for (int i = 1; i < index; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        temp.next = temp.next.next;
    }

    // reverse linked list
    public Node reverse() {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return prev;
    }

    public Node reverseRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        Node nextHead = head.next;
        nextHead.next = head;
        head = null;
        return newHead;
    }
}
