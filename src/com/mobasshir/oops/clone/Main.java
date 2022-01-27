package com.mobasshir.oops.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human mobasshir = new Human(20, "Mobasshir Imam");

        Human twin = (Human) mobasshir.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
