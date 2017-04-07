package yuriy.labs.l_2_2.LabWork2_2_5;

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

public class A {
    private static final double PI  = 3.1415926;
    double square;
    double length ;
    double width;
    double radius;

    public static int calcSquare (int length){
        length *=length;
        return length;
    }

    public static int calcSquare (int length, int width){
        int result = length * width;
        return result;
    }
    public static double calcSquare (double radius){
        double result = radius * radius * PI;
        return (int) result;
    }
}
