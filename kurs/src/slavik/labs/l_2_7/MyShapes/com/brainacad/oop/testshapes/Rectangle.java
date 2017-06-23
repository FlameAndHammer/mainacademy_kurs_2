package slavik.labs.l_2_7.MyShapes.com.brainacad.oop.testshapes;

public class Rectangle extends Shape {
    private double width,
            height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }
    @Override
    public String toString() {
        return super.toString() + " width=" + width + " height=" + height;
    }
    @Override
    public double calcArea() {
        return width * height;
    }
}
