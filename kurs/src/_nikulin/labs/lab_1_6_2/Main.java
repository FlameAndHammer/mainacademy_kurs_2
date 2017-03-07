package _nikulin.labs.lab_1_6_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };

        System.out.println("Source array:" + Arrays.toString(m));

            // version 1
        int minValue = m[0];
        for (int i = 1; i<m.length; i++) {
            if (m[i] < minValue) {
                minValue = m[i];
            }
        }
        System.out.println("Minimum value -> " + minValue);

            // versoin 2
        int maxValue = Integer.MIN_VALUE;
        for (int element : m) {
            if (element > maxValue) {
                maxValue = element;
            }
        }
        System.out.println("Maximum value -> " + maxValue);

        int sum = 0;
        for(int number : m) {
            sum += number;
        }
        double average = (double)sum/m.length;
        System.out.println("Average -> " + average);
    }
}
