package com.mobasshir.oops.inharitance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box();
        // System.out.println(box.l + " " + box.b + " " + box.h);
        // Box cube = new Box(2.0);
        // System.out.println(cube.l + " " + cube.b + " " + cube.h);
        // Box cuboid = new Box(4.0, 3.0, 5.0);
        // System.out.println(cuboid.l + " " + cuboid.b + " " + cuboid.h);
        // Box box1 = new Box(box);
        // System.out.println(box1.l + " " + box1.b + " " + box1.h);

        BoxWt newBox = new BoxWt();
        BoxWt newBox1 = new BoxWt(3, 4, 5, 2);
        System.out.println(newBox.l + " " + newBox.b + " " + newBox.h + " " + newBox.w);
        System.out.println(newBox1.l + " " + newBox1.b + " " + newBox1.h + " " + newBox1.w);
    }
}
