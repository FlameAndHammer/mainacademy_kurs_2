package yuriy.labs.l_1_5;
import java.util.Scanner;

/**
 * Created by Ruble on 05.03.2017.
 */

/*
Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
        Also compute and display the average.
        The output shall look like:
        The Sum is: 100
        The Avg is: 10
*/

public class LabWork1_5_5 {
    public static void main(String[] args) {
        int upperBound = 0;
        int sum = 0;
        int avg = 0;
        System.out.println("Enter the upper bound:");
        Scanner sc0 = new Scanner(System.in);

        outer:
        if(sc0.hasNextInt()) {upperBound = sc0.nextInt();}
        else {System.out.println("It’s not integer");
            break outer;}

            for (int i = 1; i <= upperBound; i++){
                sum = sum + i;
            }
        System.out.println("The Sum is: " + sum);
        avg = sum / upperBound;
        System.out.println("The Avg is: " + avg);

    }
}
