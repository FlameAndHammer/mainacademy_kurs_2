package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_07_b_MyShapes.testshapes;

/**
 * Created by Ruble on 08.05.2017.
 */
public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.rint(100.0 * (Math.sqrt(Math.abs(s * (s - a) * (s - b) * (s - c))))) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " a = " + a + " b = " + b + " c = " + c;
    }
}
