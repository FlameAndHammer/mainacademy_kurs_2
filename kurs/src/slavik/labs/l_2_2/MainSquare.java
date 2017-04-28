package slavik.labs.l_2_2;
public class MainSquare {
    public static void main(String[] args) {
        A total = new A();
        total.calcSquare(56.7); // Square foursquare
        total.calcSquare(6.8, 7.2); // Square rectangle
        total.calcSquare(6); // Square circle
        total.calcSquare(9, 3); // Square rectangle


        B way = new B();  // * Write class with method that will take final integer and assign to it the square of this integer and print result. What will you get? Explain result.
        way.squareB(69);

    }
}