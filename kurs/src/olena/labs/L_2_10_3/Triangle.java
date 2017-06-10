package olena.labs.L_2_10_3;

/**
 * Created by elenafostachuk on 6/9/17.
 */
public class Triangle extends Shape {
    public double side_a,
            side_b,
            side_c;

    public Triangle(String shapecolor, double side_a, double side_b, double side_c) {
        super(shapecolor);
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public String toString() {
        return super.toString() + "side a =" + side_a + "side b =" + side_b + "side c =" + side_c;
    }

    public double CalcArea() {
        double p = (side_a + side_b + side_c) / 2;
        return Math.sqrt(p * (p - side_a) * (p - side_b) * (p - side_c));
    }

    public static Triangle parseTriangle(String value) {
        String[] words = value.split("[:,]");
        return new Triangle(words[1], Double.parseDouble(words[2]), Double.parseDouble(words[3]),
                Double.parseDouble(words[4]));
    }


    }



