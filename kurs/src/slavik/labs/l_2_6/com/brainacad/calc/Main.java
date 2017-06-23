package slavik.labs.l_2_6.com.brainacad.calc;
import slavik.labs.l_2_6.com.brainacad.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle Trin = new Triangle(1.0, 2.0, 3.0);
        System.out.println(Trin.getArea());
    }
}