package artur.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Arthur on 04.03.2017.
 * Write a program that find and displays all perfect numbers
 * from 1 to n (perfect number is a positive integer that is equal
 * to the sum of its proper positive divisors, excluding the number itself).
 */
public class Laba_1_5_7 {
    public static void main(String[] args) {
        System.out.println("input a number N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int sum;
        int d; // divisor

        for ( int i=1; i<=n; i++){
            sum = 0;
            for (d=1; d<i; d++){
                if (i%d == 0){
                    //System.out.println("   d: " +d  +" sum do:  " +sum);
                    sum = sum + d;
                   // System.out.println("sum posle " +sum);
                    if (sum==i && d==i/2) System.out.println("     " +sum);
                }
            }
        }
        System.out.println();
    }
}

