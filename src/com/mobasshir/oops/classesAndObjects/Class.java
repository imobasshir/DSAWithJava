package com.mobasshir.oops.classesAndObjects;

public class Class {
    public static void main(String[] args) {
        Student1 student1 = new Student1();           // Declaring and allocating memory to object
        student1.rollno = 1;
        student1.name = "Mobasshir Imam";
        student1.marks = 78.9f;
        System.out.println("Marks of Student1 is: " + student1.marks);
    }
}

class Student1 {
    int rollno;
    String name;
    float marks;
}