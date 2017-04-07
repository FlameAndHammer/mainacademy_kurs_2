package ovanes.labs.l_2_1.L2_5;

/**
 * Created by User on 07.04.2017.
 */
public class Calc {
    public void  calcSquare (double side) {System.out.println ("Square foursquare: " + (side * side ));
    }
    public void calcSquare (double side_A, double side_B){
        System.out.println("Square rectangle: "+(side_A*side_B));
    }
    public void  calcSquare (int radius) {
        System.out.println("Square circle: " + (Math.PI * radius*radius));
    }
}
