package yuriy.labs.labs_3.l_07.LabWork_1_7_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by Ruble on 04.09.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        Integer[] arr = getRandomArr (15);
        System.out.println(Arrays.toString(arr));



        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    /*    Arrays.sort(arr, new Comparator <Integer>()
        { public int compare (Integer i1, Integer i2){
        return i2 - i1;}
        });

        System.out.println(Arrays.toString(arr));
*/

        Arrays.sort(arr, (i1, i2) -> i2 - i1);

        System.out.println(Arrays.toString(arr));

        ////


    }
    private static Integer [] getRandomArr (int size)
    {
        Integer[] arr = new Integer[size];
        Random generator = new Random();
        for (int i = 0; i < size; i++)
        {
            arr[i] = generator.nextInt(100);
        }
        return arr;
    }
}
