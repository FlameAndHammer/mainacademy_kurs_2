package slavik.labs.l_2_6.com.brainacad.shapes;

import static java.lang.Math.sqrt;

public class Triangle {
    private  double a, b, c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea() {
        double s = (a + b + c) / 2;
        return sqrt(s *(s - a) + (s - b) * (s - c));
    }
}
