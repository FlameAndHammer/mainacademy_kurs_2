package yuriy.labs.l_1_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ruble on 10.03.2017.
 */
/*

Write a program, which uses a binary search in a sorted array of integer numbers to find
        a certain element.
*/

public class LabWork1_6_4 {
    public static void main(String[] args) {

        System.out.println("LabWork1_6_4 by Yuriy Denezhko:");
        System.out.println();

        System.out.println("Enter the length of array:");

        Scanner sc0 = new Scanner(System.in);
        int lengthOfArray = sc0.nextInt();

        int array[] = new int[lengthOfArray];


        System.out.println("Enter the element’s of array:");


        Scanner sc1 = new Scanner(System.in);

        for (int i = 0; i < lengthOfArray; i++) {

            array[i] = sc1.nextInt();

        }

        Arrays.sort(array);

        System.out.println("Enter find a certain element:");
        int certainElement = sc1.nextInt();
        int retVal = Arrays.binarySearch(array,certainElement);


        System.out.println("The sorted array is:");
        for (int i = 0; i < lengthOfArray; i++) {

            System.out.print(array[i] + " ");

        }
        System.out.println();

        System.out.println("The index of element is - " + retVal);








    }
}
