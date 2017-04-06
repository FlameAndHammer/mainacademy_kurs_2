package maksim.labs.l_2_4;

import java.util.Scanner;

/**
 * Created by Пк on 06.04.2017.
 */
public class GravityCalculator {
    private static final double G = 9.81;

    public void calcDist (double doubleTime, double vi, double xi){
        double t = doubleTime / 2;
        double xt = 0.5 * G * (Math.pow(t, 2)) + vi * t;
        System.out.println("Start conditions.");
        System.out.println("Start position:\t" + xi + " m");
        System.out.println("Start speed:\t" + vi + " m/s");
        System.out.println("Time of falling:\t" + t + " s");
        System.out.println("Gravity:\tEarth");
        System.out.println();
        if (xi > 0) {
            System.out.println("The object will fall by " + xt + " meters\nand will be in " + (xi - xt) + " meters from earth");
        }
        else {
            System.out.println("The object is on the earth");
        }
        if (xt > xi){
            System.out.println("The object will hit the Earth. RUN!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter start position of object in meters:");
        Scanner scp = new Scanner(System.in);
        double xi = scp.nextDouble();
        System.out.println("Enter start speed of object in meters per second:");
        Scanner scv = new Scanner(System.in);
        double vi = scv.nextDouble();
        System.out.println("Enter time of object falling in seconds:");
        Scanner scs = new Scanner(System.in);
        double doubleTime = scs.nextDouble() * 2;
        GravityCalculator gc = new GravityCalculator();
        gc.calcDist(doubleTime, vi, xi);
    }
}
