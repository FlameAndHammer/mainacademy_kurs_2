package arthur.labs.l_1_6;

import java.util.Arrays;

/**
 * Created by Arthur on 07.03.2017.
 *Write a program, which uses a binary search
 *  in a sorted array of integer numbers to find a certain element.
 */

public class Laba_1_6_4 {
    public static void main(String[] args) {
        System.out.println();
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m, 0 , m.length);
        int a = Arrays.binarySearch(m,22);
        for ( int cell : m ) System.out.print(" " + cell);
        System.out.println("\n The index of number 22 is: " + a);
    }
}
