package yuriy.labs.labs_1.l_1_4;

import java.util.Scanner;

/**
 * Created by Ruble on 04.03.2017.
 */

//Write a console program that prints result of Ternary operator for integer variable initialization.

public class LabWork1_4_7 {

    public static void main(String[] args) {

        System.out.println("Enter the integer variable 1:");
        Scanner sc = new Scanner(System.in);
        int integerVariable1 = sc.nextInt();
        System.out.println("Enter the integer variable 2:");
        Scanner sc1 = new Scanner(System.in);
        int integerVariable2 = sc1.nextInt();

        System.out.println("Enter the BooleanExpression ( 1 OR 0):");

        byte intBooleanExpression = 0;
        boolean booleanExpression = false;
        boolean exit = false;

        do {

            Scanner sc2 = new Scanner(System.in);
            intBooleanExpression = sc2.nextByte();
            if (intBooleanExpression == 0) {
                booleanExpression = false;
                exit = true;
            }
             else if (intBooleanExpression == 1) {
                booleanExpression = true;
                exit = true;
            }
             else {
                // boolean exit = false;
                System.out.println("Not 1 OR 0, try again:");
            }

        } while ( exit == false );


        System.out.println("Result of Ternary operator for this variables: " +
                (booleanExpression ? integerVariable1 : integerVariable2));



    }

}
