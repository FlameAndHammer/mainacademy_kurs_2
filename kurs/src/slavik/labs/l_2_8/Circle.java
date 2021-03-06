package slavik.labs.l_2_8;

public class Circle extends Shape {
    private double radius;
    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() { return Math.PI * radius * radius ; }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius ;
    }


}
