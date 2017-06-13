package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_07_b_MyShapes.testshapes;

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
