package olena.labs.L_2_10_3;

/**
 * Created by elenafostachuk on 6/9/17.
 */
public class Circle extends Shape {
    private double radius;

    public Circle(String shapecolor, double radius) {
        super(shapecolor);
        this.radius = radius;
    }

    public double CalcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + ", radius=" + radius;
    }

    public static Circle parseCircle(String value) {
        String[] words = value.split(":");
        return new Circle(words[1], Double.parseDouble(words[2]));
    }
}


