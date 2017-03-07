package _nikulin.labs.lab_1_5_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit of the range -> ");
        int number = scanner.nextInt();

        int counter = 1;
        int sumOfDivisors;

        while (counter <= number) {
            sumOfDivisors = 0;
            int currentDivider = 1;

            while (currentDivider < counter) {
                if (counter % currentDivider == 0) {
                    sumOfDivisors += currentDivider;
                }
                currentDivider++;
            }

            if (sumOfDivisors == counter) {
                System.out.println("Perfect number = " + counter);;
            }
            counter++;
        }
    }
}
