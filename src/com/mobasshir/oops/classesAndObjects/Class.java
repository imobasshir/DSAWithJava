package com.mobasshir.oops.classesAndObjects;

public class Class {
    public static void main(String[] args) {
        Mobasshir student1 = new Mobasshir();           // Declaring and allocating memory to object
        student1.rollno = 1;
        student1.name = "Mobasshir Imam";
        student1.marks = 78.9f;
        System.out.println("Marks of "+ student1.name+" is: " + student1.marks);
    }
}

class Mobasshir {
    int rollno;
    String name;
    float marks;
}