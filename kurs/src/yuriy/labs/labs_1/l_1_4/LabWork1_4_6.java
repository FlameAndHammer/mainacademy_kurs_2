package yuriy.labs.labs_1.l_1_4;

import java.util.Scanner;

/**
 * Created by Ruble on 02.03.2017.
 */

/*Write a console program that prints result of Bitwise operators for two integer variables.*/

public class LabWork1_4_6 {
    public static void main(String[] args) {

        System.out.println("Enter the integer variable1:");
        Scanner sc = new Scanner(System.in);
        int integerVariable1 = sc.nextInt();
        System.out.println("Enter the integer variable2:");
        Scanner sc1 = new Scanner(System.in);
        int integerVariable2 = sc1.nextInt();


        System.out.println("Result of Bitwise AND: " + (integerVariable1 & integerVariable2));

        System.out.println("Result of Bitwise OR: " + (integerVariable1 | integerVariable2));

        System.out.println("Result of Bitwise XOR: " + (integerVariable1 ^ integerVariable2));

        System.out.println("Result of Bitwise NOT1: " + (~integerVariable1));

        System.out.println("Result of Bitwise NOT2: " + (~integerVariable2));

    }
}
