package com.mobasshir.linkedlist.singly;

public class LinkedL {
    Node head;
    private int size;

    LinkedL() {
        this.size = 0;
    }

    /**
     * Node
     */
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
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

    // deletion at start
    public void deleteStart() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // deleteion at last
    public void delete() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    // print linked list
    public void printList() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedL list = new LinkedL();
        list.addFirst("hello");
        list.printList();
        System.out.println(list.getSize());

        list.addFirst("hey");
        list.printList();
        System.out.println(list.getSize());

        list.add("world");
        list.printList();
        System.out.println(list.getSize());

        list.deleteStart();
        list.printList();
        System.out.println(list.getSize());

        list.add("mobasshir");
        list.add("imam");
        list.printList();
        System.out.println(list.getSize());

        list.delete();
        list.printList();
        System.out.println(list.getSize());
    }
}
