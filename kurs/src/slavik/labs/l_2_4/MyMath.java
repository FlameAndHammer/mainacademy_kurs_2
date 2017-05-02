package slavik.labs.l_2_4;

public class MyMath {
    public final static double PI = 3.14;
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

    public static double areaOfCircle(double radius) {
        return PI * Math.pow(radius, 2);
    }
}
