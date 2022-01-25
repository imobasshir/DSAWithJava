package com.mobasshir.oops.inharitance;

public class BoxPrice extends BoxWt {
    double cost;

    public BoxPrice(){
        super();
        this.cost = -1.0;
    }

    public BoxPrice(double l, double b, double h, double w, double cost) {
        super(l, b, h, w);
        this.cost = cost;
    }
}
