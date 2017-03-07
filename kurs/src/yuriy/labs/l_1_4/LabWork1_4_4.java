package yuriy.labs.l_1_4;

import java.util.Scanner;

/**
 * Created by Ruble on 02.03.2017.
 */

        /**
         * Write a console program that prints result of increment and decrement in prefix and
        postfix mode for integer variable.
         */

public class LabWork1_4_4 {
    public static void main(String[] args) {

        System.out.println("Enter the integer variable:");
        Scanner sc = new Scanner(System.in);
        int integerVariable = sc.nextInt();

        System.out.println("Result of increment in prefix mode: " + integerVariable++);

        System.out.println("Result of decrementin prefix mode: " + integerVariable--);

        System.out.println("Result of increment in postfix mode: " + ++integerVariable);

        System.out.println("Result of decrementin postfix mode: " + --integerVariable);



    }
}
