package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_04;

import java.util.Scanner;

/**
 * Created by Ruble on 06.04.2017.
 */
/*
Lab Work 2-4-5
        The value of π can be calculated with the series:
        π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
        Write a class MyCalc with public static method calcPi(int) that takes as parameter an
        integer n, and computes and returns the value of π approximated to the first n terms of
        the series.
*/

public class MyCalc {

     public static double calcPi(int n){
          double pi = 0;
         for (int i = 1; i < (n+1); i++){
             pi += Math.pow(-1,i) * 4 / (i * 2 + 1);
         }
         pi = 4 + pi;
         return pi;
     }

    public static void main(String[] args) {
        System.out.println("LabWork_2_4_5 by Yuriy Denezhko:");
        System.out.println();
        System.out.print("Enter the parameter an integer n -> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("pi = " + calcPi(n));
    }
}
