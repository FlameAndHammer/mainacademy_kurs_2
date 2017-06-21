package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_3.TestGenerics2;

import java.util.Arrays;
/*
  Created by Ruble on 20.06.2017.
*/


public class MyTestMethod
{


    public static <T extends Number>  String calcSum  (T[] array, T maxValue) //implements Comparable <Object>
    {
        //T result;
        String srtResult = "";
        String srt =  array[0].getClass().getName();

        switch (srt)
        {
            case "java.lang.Integer":
            {
                Integer result = 0;
                for (int i = 0; i < array.length; i++)
                {
                 if (maxValue.intValue() < array[i].intValue())
                    {
                        result += array[i].intValue();
                    }
                }
                srtResult = result.toString();
                break;
            }
            case "java.lang.Double":
            {
                Double result = 0.0;
                for (int i = 0; i < array.length; i++)
                {
                    if (maxValue.doubleValue() < array[i].doubleValue())
                    {
                        result += array[i].doubleValue();
                    }
                }
                srtResult = result.toString();
                break;
            }
            default: srtResult = "Not in the assignment";
        }

        return srtResult;
    }
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
