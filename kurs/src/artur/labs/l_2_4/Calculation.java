package artur.labs.l_2_4;
import java.util.Arrays;

/**
 * Created by Arthur on 04.04.2017.
 * Create class Calculation, which will create two arrays of integers
 * and use findMin and findMax static methods of MyMath class.
 * _____________
 *
 */
public class Calculation {
    public static void main(String[] args) {
       MyMath obj = new MyMath();
       int[] array1 = new int[10];
       int[] array2 = new int[10];
       for (int i=0; i<10; i++){
           array1[i] = (int) (Math.random() * 100);
           array2[i] = (int) (Math.random() * 100);
       }
       double radius = Math.random() * 100;

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        System.out.println("Radius: " + radius);

       int min1 = obj.findMin(array1);
       int min2 = obj.findMin(array2);
       int max1 = obj.findMax(array1);
       int max2 = obj.findMax(array2);
       double square = obj.calcArea(radius);

        System.out.println( " min1: " + min1 + " max1: " + max1);
        System.out.println( " min2: " + min2 + " max2: " + max2);
        System.out.println( " square: " + square);

    }
}
