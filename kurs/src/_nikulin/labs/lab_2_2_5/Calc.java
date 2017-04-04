package _nikulin.labs.lab_2_2_5;

public class Calc {
    public void calcSquare(double side) {
        System.out.println("Square foursquare: " + (side * side));
    }
    public void calcSquare(double side_1, double side_2) {
        System.out.println("Square rectangle: " + (side_1 * side_2));
    }
    public void calcSquare(int radius) {
        System.out.println("Square circle: " + (Math.PI * radius*radius));
    }
}
