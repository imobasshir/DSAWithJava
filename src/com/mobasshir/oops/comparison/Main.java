package com.mobasshir.oops.comparison;

public class Main {
    public static void main(String[] args) {
        Student mobasshir = new Student(1, 76.33f);
        Student ibrahim = new Student(2, 80.97f);

        if (ibrahim.compareTo(mobasshir) > 0) {
            System.out.println(ibrahim.compareTo(mobasshir));
            System.out.println("Ibrahim have more marks");
        }
    }
}
