package slavik.labs.l_2_7.MyShapes.com.brainacad.oop.testshapes;


public class Triangle extends Shape {
    private double sise_a,
            side_b,
            side_c;

    public Triangle(String shapeColor, double sise_a, double side_b, double side_c) {
        super(shapeColor);
        this.sise_a = sise_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    @Override
    public double calcArea() {
        double p = (sise_a + side_b + side_c) / 2;
        return Math.sqrt(p * (p - sise_a) * (p - side_b) * (p -side_c));
    }
    @Override
    public String toString() {
        return super.toString() + ", a=" + sise_a +", b=" + side_b + ", c=" + side_c;
    }
}
