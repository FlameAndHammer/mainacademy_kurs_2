package slavik.labs.l_2_7.MyShapes.com.brainacad.oop.testshapes;

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
        return "This is " + getClass().getSimpleName()+ " " +
                "Color='" + shapeColor + '\'';
    }
}
