package com.mobasshir.oops.classesAndObjects;

public class Constructor {
    public static void main(String[] args) {
        Student student1 = new Student(4, "Mobasshir Imam", 88f);
        // student1.greeting();
        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        Student studentRandom = new Student();
        System.out.println(studentRandom.marks);
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
        this.marks = 79f;
    }

    Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
