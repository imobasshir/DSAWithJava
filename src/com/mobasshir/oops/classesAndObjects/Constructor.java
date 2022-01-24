package com.mobasshir.oops.classesAndObjects;

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.greeting();
        // System.out.println(student1.rollno);
        // System.out.println(student1.name);
        // System.out.println(student1.marks);
    }
}

class Student {
    int rollno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello! My name is " + name);
    }

    Student() {
        this.rollno = 1;
        this.name = "Mobasshir";
        this.marks = 79.9f;
    }
}
