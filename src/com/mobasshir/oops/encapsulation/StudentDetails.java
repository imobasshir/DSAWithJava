package com.mobasshir.oops.encapsulation;

public class StudentDetails {
    public static void main(String args[]) {
        Student obj = new Student();

        // Setting the values of the variables
        obj.setStudentName("Mobasshir");
        obj.setStudentRollno(60);
        obj.setStudentAge(20);

        // Printing the values of the variables

        System.out.println("Student Name : " + obj.getStudentName());
        System.out.println("Student Rollno : " + obj.getStudentRollno());
        System.out.println("Student Age : " + obj.getStudentAge());
    }
}
