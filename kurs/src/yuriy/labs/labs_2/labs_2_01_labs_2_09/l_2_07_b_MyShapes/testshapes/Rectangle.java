package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_07_b_MyShapes.testshapes;

/**
 * Created by Ruble on 08.05.2017.
 */
public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return Math.rint(100.0 * width * height) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " width = " + width + ", height = " + height;
    }
}
