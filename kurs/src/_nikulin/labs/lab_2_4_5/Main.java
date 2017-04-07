package _nikulin.labs.lab_2_4_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms of the series: ");
        double pi = MyCalc.caicPi(sc.nextInt());
        System.out.println("PI = " + pi);
    }
}
