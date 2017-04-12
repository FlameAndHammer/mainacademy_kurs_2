package olena.labs.L_2_2_2.L_2_2_5;

/**
 * Created by elenafostachuk on 4/5/17.
 */
public class A {
    double side,
           radius;
    final int SIDE = 8;

    public void Asquare( double side1, double side2){
        System.out.println("Square of rectangle: " + (side1 * side2));}
    public void Asqurefinal(int SIDE){
        System.out.println("Square of foursquare: " + Math.pow(8,2));}
    public void AcircleSquare(double radius){
        System.out.println("Square of circle: " + Math.PI * (radius * radius));
    }
}
