package yuriy.labs.labs_1.l_1_5;

import java.util.Scanner;

/**
 * Created by Ruble on 05.03.2017.
 */

// Write a program that calculates and displays the  of digits of number

public class LabWork1_5_6 {
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int i2 = 0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        for (int i = 0; i<number.length(); i++){
            i2 = Integer.parseInt(String.valueOf(number.charAt(i)));
            sumOfSquares = sumOfSquares + (int) Math.pow(i2, 2);
            if (i < (number.length()-1)){
                System.out.print((int) Math.pow(i2, 2) + " + ");
            }
        }
        System.out.print((int) Math.pow(i2, 2));
        System.out.println(" = " + sumOfSquares);
    }

}
