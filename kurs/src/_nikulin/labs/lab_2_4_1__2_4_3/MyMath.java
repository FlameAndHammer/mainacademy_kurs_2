package _nikulin.labs.lab_2_4_1__2_4_3;

public class MyMath {
        // lab 2_4_3
    public final static double PI = 3.14;
    public static double areaOfCircle(double radius) {
        return PI * Math.pow(radius, 2);
    }

        // lab 2_4_1
    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int element : array)
            if (minValue > element)
                minValue = element;
        return minValue;
    }
    public static int findMax(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int element : array)
            if (maxValue < element)
                maxValue = element;
        return maxValue;
    }
}

