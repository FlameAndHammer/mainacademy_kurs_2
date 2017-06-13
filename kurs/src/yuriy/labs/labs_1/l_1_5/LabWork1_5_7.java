package yuriy.labs.labs_1.l_1_5;

import java.util.Scanner;

/**
 * Created by Ruble on 05.03.2017.
 */

/*
Write a program that find and displays all perfect numbers from 1 to n (perfect number
        is a positive integer that is equal to the sum of its proper positive divisors, excluding the
        number itself).
*/

public class LabWork1_5_7 {
    public static void main(String[] args) {
        System.out.println("Enter the range (n):");
        long n = 0;
        long count = 0;
        Scanner sc0 = new Scanner(System.in);

        outer:
        if(sc0.hasNextLong()) {n = sc0.nextLong();}
        else {System.out.println("It’s not Long");
            break outer;}

        if (n >= 6){
            System.out.println(6);
            for (long i = 6; i <= n; i++){
                count = 0;
                for (long j = 1; j <= (n/2); j++){
                    if ((i % j) == 0 ){
                        count = count + j;
                    }
                }
                if (count == i){
                    System.out.println(count + " ");
                }
            }
        }
        else System.out.println("In this range there are no perfect numbers!");


    }
}
