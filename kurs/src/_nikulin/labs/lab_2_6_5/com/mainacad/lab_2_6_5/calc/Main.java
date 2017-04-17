package _nikulin.labs.lab_2_6_5.com.mainacad.lab_2_6_5.calc;

import _nikulin.labs.lab_2_6_5.com.mainacad.lab_2_6_5.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle object = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Area Triangle = " + object.getArea());
    }
}
