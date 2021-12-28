package com.mobasshir.questions;

public class Area {
    public static void main(String[] args) {
        System.out.println(areaCircle(5));
        System.out.println(areaCircleWithoutMathFunction(5));
        System.out.println(areaTriangle(5, 4));
        System.out.println(areaEqTriangle(5));
    }

    static double areaCircle(int r) {
        double area = Math.PI * r * r;
        return area;
    }

    static double areaCircleWithoutMathFunction(int r) {
        double area = 3.14159265 * r * r;
        return area;
    }

    static int areaTriangle(int b, int h) {
        int area = (b * h) / 2;
        return area;
    }
    static float areaEqTriangle(int a) {
        float area = (1.73f * a * a) / 4;
        return area;
    }
}
