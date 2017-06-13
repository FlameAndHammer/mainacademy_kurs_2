package yuriy.labs.l_2_07_b_MyShapes.com.brainacad.oop.testshapes;

/**
 * Created by Ruble on 08.05.2017.
 */
public class Circle extends Shape{
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.rint(100.0 * (Math.PI * Math.pow(radius,2))) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius ;
    }
}
