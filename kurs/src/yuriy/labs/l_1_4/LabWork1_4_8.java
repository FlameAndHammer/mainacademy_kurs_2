package yuriy.labs.l_1_4;

import java.util.Scanner;

import  java.io.IOException;

/**
 * Created by Ruble on 05.03.2017.
 */

// Write a console program that prints result type casting for different primitive types.


public class LabWork1_4_8 {

    public static void main(String[] args) {

        System.out.println("Enter the byte variable:");
        Scanner sc0 = new Scanner(System.in);
        byte byteVariable = sc0.nextByte();

        //System.out.println("Result type casting to byte: " + (byte) byteVariable);
        System.out.println("Result type casting to char: " + (char) byteVariable);
        System.out.println("Result type casting to short: " + (short) byteVariable);
        System.out.println("Result type casting to int: " + (int) byteVariable);
        System.out.println("Result type casting to long: " + (long) byteVariable);
        System.out.println("Result type casting to float: " + (float) byteVariable);
        System.out.println("Result type casting to double: " + (double) byteVariable);
        System.out.println();
        System.out.println();


        System.out.println("Enter the char variable:");
        Scanner sc1 = new Scanner(System.in);
        String string = sc1.next();
        char charVariable = string.charAt(0);


        System.out.println("Result type casting to byte: " + (byte) charVariable);
       // System.out.println("Result type casting to char: " + (char) charVariable);
        System.out.println("Result type casting to short: " + (short) charVariable);
        System.out.println("Result type casting to int: " + (int) charVariable);
        System.out.println("Result type casting to long: " + (long) charVariable);
        System.out.println("Result type casting to float: " + (float) charVariable);
        System.out.println("Result type casting to double: " + (double) charVariable);
        System.out.println();
        System.out.println();

        System.out.println("Enter the short variable:");
        Scanner sc2 = new Scanner(System.in);
        short shortVariable = sc2.nextShort();

        System.out.println("Result type casting to byte: " + (byte) shortVariable);
        System.out.println("Result type casting to char: " + (char) shortVariable);
        //System.out.println("Result type casting to short: " + (short) shortVariable);
        System.out.println("Result type casting to int: " + (int) shortVariable);
        System.out.println("Result type casting to long: " + (long) shortVariable);
        System.out.println("Result type casting to float: " + (float) shortVariable);
        System.out.println("Result type casting to double: " + (double) shortVariable);
        System.out.println();
        System.out.println();


        System.out.println("Enter the integer variable:");
        Scanner sc3 = new Scanner(System.in);
        int integerVariable = sc3.nextInt();

        System.out.println("Result type casting to byte: " + (byte) integerVariable);
        System.out.println("Result type casting to char: " + (char) integerVariable);
        System.out.println("Result type casting to short: " + (short) integerVariable);
        // System.out.println("Result type casting to int: " + (int) integerVariable);
        System.out.println("Result type casting to long: " + (long) integerVariable);
        System.out.println("Result type casting to float: " + (float) integerVariable);
        System.out.println("Result type casting to double: " + (double) integerVariable);
        System.out.println();
        System.out.println();


        System.out.println("Enter the long variable:");
        Scanner sc4 = new Scanner(System.in);
        long longVariable = sc4.nextLong();

        System.out.println("Result type casting to byte: " + (byte) longVariable);
        System.out.println("Result type casting to char: " + (char) longVariable);
        System.out.println("Result type casting to short: " + (short) longVariable);
        System.out.println("Result type casting to int: " + (int) longVariable);
        //System.out.println("Result type casting to long: " + (long) longVariable);
        System.out.println("Result type casting to float: " + (float) longVariable);
        System.out.println("Result type casting to double: " + (double) longVariable);
        System.out.println();
        System.out.println();


        System.out.println("Enter the float variable:");
        Scanner sc5 = new Scanner(System.in);
        float floatVariable = sc5.nextFloat();

        System.out.println("Result type casting to byte: " + (byte) floatVariable);
        System.out.println("Result type casting to char: " + (char) floatVariable);
        System.out.println("Result type casting to short: " + (short) floatVariable);
        System.out.println("Result type casting to int: " + (int) floatVariable);
        System.out.println("Result type casting to long: " + (long) floatVariable);
        //System.out.println("Result type casting to float: " + (float) floatVariable);
        System.out.println("Result type casting to double: " + (double) floatVariable);
        System.out.println();
        System.out.println();


        System.out.println("Enter the double variable:");
        Scanner sc6 = new Scanner(System.in);
        double doubleVariable = sc6.nextDouble();

        System.out.println("Result type casting to byte: " + (byte) doubleVariable);
        System.out.println("Result type casting to char: " + (char) doubleVariable);
        System.out.println("Result type casting to short: " + (short) doubleVariable);
        System.out.println("Result type casting to int: " + (int) doubleVariable);
        System.out.println("Result type casting to long: " + (long) doubleVariable);
        System.out.println("Result type casting to float: " + (float) doubleVariable);
        //System.out.println("Result type casting to double: " + (double) floatVariable);
        System.out.println();
        System.out.println();



    }
}
