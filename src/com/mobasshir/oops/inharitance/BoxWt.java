package com.mobasshir.oops.inharitance;

public class BoxWt extends Box {
    double w;

    public BoxWt() {
        this.w = -1;
    }

    public BoxWt(double l, double b, double h, double w) {
        super(l, b, h); // used to call parent class constructor
        this.w = w;
    }
}
