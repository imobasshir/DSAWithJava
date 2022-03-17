package com.mobasshir.oops.encapsulation;

public class Student {
    private String studentName;
    private int studentRollno;
    private int studentAge;

    // Getter method for student name to access private variable studentName
    public String getStudentName() {
        return studentName;
    }

    // Setter method for student name to set the value in private variable
    // studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter method for student rollno to access private variable studentRollno
    public int getStudentRollno() {
        return studentRollno;
    }

    // Setter method for student rollno to set the value in private variable
    // studentRollno
    public void setStudentRollno(int studentRollno) {
        this.studentRollno = studentRollno;
    }

    // Getter method for student age to access private variable studentAge
    public int getStudentAge() {
        return studentAge;
    }

    // Setter method for student age to set the value in private variable studentAge
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

}
