package com.mobasshir.linkedlist;

public class LinkedL {
    Node head;
    /**
     * Node
     */
    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add at first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        // check weather element is present at head or not
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // add at last
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // traversing in linked list
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        // add element at last node
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.addFirst("hello");
        list.printList();

        list.addFirst("hey");
        list.printList();
        
        list.add("world");
        list.printList();
        
    }
}
