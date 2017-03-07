package _nikulin.labs.lab_1_6_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int [20];
        Scanner scanner = new Scanner(System.in);
        int position;

        for(int i=0; i<array.length; i++)
            if (i % 3 != 0) {
                array[i] = i * i - i + 1;
            } else {
                array[i] = -i * 11 + 5;
            }

        System.out.println("Created an array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted an array: " + Arrays.toString(array));

        System.out.print("\nEnter number for search -> ");
        int numberSearch = scanner.nextInt();

        if ((position = Arrays.binarySearch(array, numberSearch)) < 0) {
            System.out.println("Number in the array missing!");
        } else {
            System.out.println("Position number in the array  -> " + position);
        }
    }
}
