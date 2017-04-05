package maksim.labs.l_2_4;

import java.util.Arrays;

/**
 * Created by Пк on 05.04.2017.
 */
public class MyMath {
    static final double PI = 3.14;
    public static int findMin(int[] minArray){
        int min = minArray[0];
        for (int i = 1; i < minArray.length; i++){
              if (min > minArray[i]){
                    min = minArray[i];
            }
        }
        System.out.println("Min of this array " + Arrays.toString(minArray) + " is " + min);
        return min;
    }
        public static int findMax(int[] maxArray){
        int max = maxArray[0];
        for (int i = 1; i < maxArray.length; i++){
              if (max < maxArray[i]){
                    max = maxArray[i];
            }
        }
        System.out.println("Max of this array " + Arrays.toString(maxArray) + " is " + max);
        return max;

    }

    public static double areaOfCircle(double radius) {
        double sq = radius * radius * PI;
        System.out.println("Area of circle with radius of " + radius + " is " + sq);
        return sq;
    }


}
