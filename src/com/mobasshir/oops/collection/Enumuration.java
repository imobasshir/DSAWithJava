package com.mobasshir.oops.collection;

public class Enumuration {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // enum constants
        // every one is public static and final
        // we cannot create child enun
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        // for (Week day : week.values()) {
        // System.out.println(day);
        // }

        // for index of week
        System.out.println(week.ordinal());
    }
}
