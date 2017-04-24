package arthur.labs.l_2_7_b.MyShapes;

/**
 * Created by arthk on 24.04.2017.
 */
public class Circle extends Shape {
    private double radius;

    @Override
    public double calcArea() { return Math.PI * radius * radius ; }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius ;
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }
}
