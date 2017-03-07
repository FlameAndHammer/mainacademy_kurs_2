package _nikulin.labs.lab_1_6_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfTemperatures = {88, 34, -98, 54, 0, -23, 56, 34, 99, -76, -11};
        System.out.println("The original array temperatures: " + Arrays.toString(arrayOfTemperatures));

        int i = 0;
        int j = arrayOfTemperatures.length -1;
        while (i < j) {
            while (arrayOfTemperatures[i] < 0 && i < j) {
                i++;
            }
            while (arrayOfTemperatures[j] > 0 && j > 0) {
                j--;
            }
            if (i < j) {
                swap(arrayOfTemperatures, i, j);
            }
        }

        System.out.println("An ordered array of temperatures: " + Arrays.toString(arrayOfTemperatures));
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
