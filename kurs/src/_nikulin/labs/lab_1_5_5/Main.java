package _nikulin.labs.lab_1_5_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number n -> ");
        int countNumber = scanner.nextInt();

        int sumNumber = 0;
        for(int value=1; value<=countNumber; value++) {
            sumNumber += value;
        }

        double average = (double)sumNumber / countNumber;
        System.out.println("The summa is " + sumNumber);
        System.out.println("The average is " + average);
    }
}
