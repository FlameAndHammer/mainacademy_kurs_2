package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_3.TestGenerics2;

import java.util.Arrays;

/**
 * Created by Ruble on 20.06.2017.
 */
public class MyTestMethod
{


    /*public static <T extends Number>  T calcSum  (T[] array, T maxValue) //implements Comparable <Object>
    {
        T result = null;
        String srt = "";


        for (int i = 0; i < array.length; i++) {
            srt = (String)(maxValue.getClass());

            switch ( )
            {

            }


            //if (array[i].compareTo(maxValue) > 0) {
                //result = result. + array[i];
            //}
        }
        return result;
    }*/
    public static <T extends Comparable<T>>  Integer calcNum  (T[] array, T maxElem) //implements Comparable <Object>
    {
        int result = 0;
        //Arrays.sort(array);
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].compareTo(maxElem) > 0)
            {
                result ++;
            }
        }
        return result;
    }
}
