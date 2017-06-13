package yuriy.labs.l_2_02.LabWork2_2_5;

/**
 * Created by Ruble on 03.04.2017.
 */
/*
- Write class A with overridden methods calcSquare that calculate square of
  rectangle, square of foursquare and square of circle and print result. Write class
  that will use these methods.
- Write class with method that will take final integer and assign to it the square of
  this integer and print result. What will you get? Explain result.
*/

public class Main {
    public static void main(String[] args) {

        System.out.println("square of foursquare: " + A.calcSquare(45.8));
        System.out.println("square of circle: " + A.calcSquare(25));
        System.out.println("square of rectangle: " + A.calcSquare(25,45));

    }
}
