package _nikulin.labs.lab_2_4_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number from 1 to 9 -> ");
        MyPyramid.printPiramid(scanner.nextInt());
    }
}
