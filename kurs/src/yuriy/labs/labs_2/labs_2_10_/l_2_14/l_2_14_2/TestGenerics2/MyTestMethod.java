package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_2.TestGenerics2;

import java.util.Arrays;

/**
 * Created by Ruble on 20.06.2017.
 */
public class MyTestMethod
{
    // <T extends Comparable<T>> implements Comparable<T>
    public static <T extends Comparable<T>>  Integer calcNum  (T[] array, T maxElem) //implements Comparable <Object>
    {
        int result = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
        {
           // if (array[i].equals(maxElem))
            if (array[i].compareTo(maxElem) > 0)
            {
                result ++;
            }
        }
        return result;
    }
}
