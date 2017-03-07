package artur.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Arthur on 04.03.2017.
 * Write a program that calculates and displays the sum of squares of digits of number
 */
public class Laba_1_5_6 {
    public static void main(String[] args) {
        System.out.println("input a number");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int r=-1;// remainder from dividing by 10
        int square=0;
        int sum=0;
        while (r!=0) {
            r = n % 10;
            square = r * r;
            sum = sum + square;
            n = (n-r) / 10;
        }
        System.out.println();
        System.out.println("The sum of squares of digits of number is: " + sum);
    }
}
