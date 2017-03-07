package artur.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Arthur on 04.03.2017.
 * Write a program to produce the sum of 1, 2, 3, ...,
 * to an upper bound - n. Also compute and display the average.
 * The output shall look like: The Sum is: 100 The Avg is: 10
 */
public class Laba_1_5_5 {
    public static void main(String[] args) {
        System.out.println("input a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        float avg=0;
        for (int i=1 ; i<=n ; i++) {
            sum = sum + i;
            avg=i;
        }
        avg = sum/avg;
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
        }
    }

