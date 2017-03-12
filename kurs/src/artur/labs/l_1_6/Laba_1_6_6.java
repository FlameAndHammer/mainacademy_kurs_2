package artur.labs.l_1_6;

import java.util.Arrays;

/**
 * Created by Arthur on 07.03.2017.
 * Write a program that sorts an array of average temperature values
 * by months of 2015 as follows: at first the negative values, then - positive values
 */
public class Laba_1_6_6 {
    public static void main(String[] args) {
        System.out.println();
        int[] m = new int[] { -5, -3, -1, 0, 12, 18, 19, 17, 14, 6, -2, -4 };
        Arrays.sort(m,0,m.length);
        for ( int cell : m ) System.out.print(" " + cell);
          }
}
// did not understand the task properly