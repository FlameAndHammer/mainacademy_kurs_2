package _nikulin.labs.lab_1_2_2;

import java.util.Scanner;

/**
 * Created by Любовь on 07.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        String nameStudent = scanner.nextLine();
        System.out.println("Name of student -> " + nameStudent);
    }
}
