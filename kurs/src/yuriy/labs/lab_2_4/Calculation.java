package yuriy.labs.lab_2_4;

import java.util.Scanner;

/**
 * Created by Ruble on 05.04.2017.
 */
/*

Create class Calculation, which will create two arrays of integers and use findMin and
        findMax static methods of MyMath class.
*/

public class Calculation {
    public static void main(String[] args) {

        System.out.println("Lab Work 2-4-2 by Yuriy Denezhko:");
        System.out.println();

        System.out.print("Enter the length of array 1 -> ");
        Scanner sc = new Scanner(System.in);
        int length1 = sc.nextInt();

        int[] array1 = new int[length1];

        for (int i = 0; i < length1; i++) {
            array1[i] = (int) ((int) (Math.random () * 1000));
            System.out.print("\t" + array1[i]);
        }

        System.out.println();
        System.out.println("minimum of array 1-> " + MyMath.findMin1(array1));
        System.out.println();
        System.out.println("maximum of array 1-> " + MyMath.findMax1(array1));
        System.out.println();

        System.out.print("Enter the length of array 2 -> ");
        int length2 = sc.nextInt();

        int[] array2 = new int[length1];

        for (int i = 0; i < length1; i++) {
            array2[i] = (int) ((int) (Math.random () * 1000));
            System.out.print("\t" + array2[i]);
        }

        System.out.println();
        /*System.out.println("minimum of array 2 -> " + MyMath.findMin2(array2));
        System.out.println();
        System.out.println("maximum of array 2 -> " + MyMath.findMax2(array2));
        System.out.println();*/

        System.out.println("areaOfCircle = " + MyMath.areaOfCircle((Math.random () * 1000)));

    }
}
