package _nikulin.labs.lab_1_5_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number -> ");
        int number = scanner.nextInt();

        int sum = 0;
        if (number < 0)
            number = -number;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        System.out.println("Result = " + sum);
    }
}
