package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_04;

import java.util.Scanner;

/**
 * Created by Ruble on 06.04.2017.
 */
/*Lab Work 2-4-7
Write a program that computes the distance an object will fall in Earth's gravity.
        Create a new class called GravityCalculator with method calcDist(double time) that
        takes double time, and returns the position of an object after falling for time seconds
        (outputting the position in meters). The formula in Math notation is:
        x(t) = 0.5 × a × time 2 + vi × time + xi
        Where:
        a - Acceleration (m/s2 ) = -9.81
        t - Time (s) (for example t = 10)
        vi - Initial velocity (m/s) = 0
        xi - Initial position = 0
        Declare acceleration value field as a constant;*/

public class GravityCalculator {
    public final static double ACCELERATION = -9.81;

    public double calcDist (double time){
        double InitialPosition = (10000 * Math.random());
        double InitialVelocity = (10000 * Math.random());

        double x = 0.5 * ACCELERATION * Math.pow(time, 2) + InitialVelocity * time + InitialPosition;
        return x;}
}
class MainOfGravityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter of time (in seconds) of fall -> ");
        double time = scanner.nextInt();
        GravityCalculator gravityCalculator = new GravityCalculator();
        double distance = gravityCalculator.calcDist(time);
        if (distance > 0 ) {System.out.println("distance = " + distance + " metrs");}
        else {System.out.println("distance = 0 metrs");}


    }
}