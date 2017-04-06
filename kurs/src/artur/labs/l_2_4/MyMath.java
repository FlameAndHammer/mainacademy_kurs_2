package artur.labs.l_2_4;

import java.util.Arrays;

/**
 * Created by Arthur on 04.04.2017.
 * Create class MyMath with two static methods (findMin and findMax),
 * which will take array of int values as argument and return minimum element value
 * (for findMin method) or maximum element value (for findMax method).
 * ________________
 * Add to class MyMath final static field PI = 3.14 and static method areaOfCircle(),
 * which will take radius, use constant PI and calculate area.
 */
public class MyMath {
    public static final double PI = Math.PI;

    public int findMin(int[] array){
        int[] arrayCopy = array;
        Arrays.sort(arrayCopy);
        return arrayCopy[0];
    }

    public int findMax(int[] array){
        int[] arrayCopy = array;
        Arrays.sort(arrayCopy);
        return arrayCopy[arrayCopy.length-1];
    }

    public double calcArea(double radius){
      return PI * radius * radius;
    }
}
