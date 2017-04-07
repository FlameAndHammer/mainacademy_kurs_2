package _nikulin.labs.lab_2_4_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GravityCalculator object = new GravityCalculator();
        System.out.print("Enter of time fall: ");
        System.out.println("Distance = " + object.calcDist(scanner.nextInt()) + " m");
    }
}
