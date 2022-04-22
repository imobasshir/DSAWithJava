package com.mobasshir.linkedlist.implementaion.singly;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        System.out.println(list.getSize());

        list.insertLast(6);
        list.insertLast(8);
        list.display();
        System.out.println(list.getSize());

        list.insert(1, 3);
        list.display();
        System.out.println(list.getSize());

        list.deleteFirst();
        list.display();
        System.out.println(list.getSize());
        
        list.deleteLast();
        list.display();
        System.out.println(list.getSize());

        list.delete(2);
        list.display();
        System.out.println(list.getSize());
    }
}
