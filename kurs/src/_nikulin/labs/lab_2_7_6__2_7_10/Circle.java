package _nikulin.labs.lab_2_7_6__2_7_10;

public class Circle extends Shape {
    private double radius;
    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }
    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius ;
    }
}
