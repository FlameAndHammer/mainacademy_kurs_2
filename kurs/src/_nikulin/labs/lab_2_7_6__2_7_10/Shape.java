package _nikulin.labs.lab_2_7_6__2_7_10;

public class Shape {
    private String shapeColor;
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    public double calcArea() {
        return  0.0;
    }
    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() +
                ", color: " + shapeColor;
    }
}
