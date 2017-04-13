package olena.labs.L_2_4;
import java.util.Scanner;
/**
 * Created by elenafostachuk on 4/13/17.
 */
public class GravityCalculator {
    public static final double G = 9.81;

    public static double calcDist(double time) {
        double d = 0.5 * G * time * time + 0 * time + 0;
        return d;
    }

    public static void main(String[] args) {
        System.out.println("Input a double for time: ");
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        System.out.println("D = " + calcDist(time));
    }
}



