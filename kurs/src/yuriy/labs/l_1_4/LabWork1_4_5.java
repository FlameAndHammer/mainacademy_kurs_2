package yuriy.labs.l_1_4;

/**
 * Created by Ruble on 02.03.2017.
 */

import java.util.Scanner;

/**
 * Write a console program that prints result of bit shift operators for integer variable.
 */
public class LabWork1_4_5 {

    public static void main(String[] args) {

        System.out.println("Enter the integer variable:");
        Scanner sc = new Scanner(System.in);
        int integerVariable = sc.nextInt();
        System.out.println("Enter the step");
        Scanner sc1 = new Scanner(System.in);
        int step = sc1.nextInt();

        System.out.println("Result of Bit shift operators 1/2 left: " + (integerVariable>>step));

        System.out.println("Result of Bit shift operators 1/2 right: " + (integerVariable<<step));

        System.out.println("Result of Bit shift operators 2/2: " + (integerVariable>>>step));


    }
}



