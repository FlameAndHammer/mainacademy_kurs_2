package artur.labs.l_2_4;

import java.util.Scanner;

/**
 * Created by Arthur on 05.04.2017.
 * Write a program that calculates the distance to which the object will be
 Fall in the gravity of the Earth.
 Create a new class called GravityCalculator using calcDist
 (Double time) which takes a double time and returns the position
 Object after falling for a period of seconds (displays the position in meters). The formula in
 Mathematical notation:
 X (t) = 0.5 × a × time * time + vi × time + xi
 Where:
 - Acceleration (2 m / s) = -9.81
 T is the time (s) (for example, m = 10)
 Vi - initial speed (m / s) = 0
 X is the starting position = 0
 Declare the field as the acceleration value as a constant;
 */
public class GravityCalculator {
    public static final double G = 9.81;
    public static double calcDist (double time){
        double x = 0.5 * G * time * time + 0 * time + 0;
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Input a time  ");
        Scanner time1 = new Scanner(System.in);
        double time = time1.nextDouble();
        System.out.println("X = " + calcDist(time));
    }
}
