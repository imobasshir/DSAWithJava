package com.mobasshir.linkedlist.doubly;

public class DoublyLL {
    Node head;
    Node tail;

    public class Node {
        String data;
        Node next;
        Node prev;
        
        Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // add at start
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.prev = head;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // append at end
    public void append(String data) {
        Node newNode = new Node(data);
        Node last = head;
        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.addFirst("i");
        list.addFirst("hello");
        list.append("am");
        list.append("mobasshir");
    }
}
