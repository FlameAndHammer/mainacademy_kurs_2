package slavik.labs.l_2_2;
public class A {
    public void calcSquare(double side) {
        System.out.println("Square foursquare: " + (side * side));
    }
    public void calcSquare(double side1, double side2) {
        System.out.println("Square rectangle: " + (side1 * side2));
    }
    public void calcSquare(int diameter) {
        System.out.println("Square circle: " + (Math.PI/4 * diameter*diameter));
    }
}

