package olena.labs.L_2_4;
import java.util.Arrays;

/**
 * Created by elenafostachuk on 4/7/17.
 */
public class MyMath {
    static final double PI = 3.14;
    public int[] arr;

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr) + min);
        return min;
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr) + max);
        return max;
    }

    public static double AreaOfCircle(double radius) {
        double square = radius * radius * PI;
        System.out.println(square);
        return square;
    }
}

