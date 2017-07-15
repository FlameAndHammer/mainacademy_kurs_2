package yuriy.labs.labs_2.labs_2_10_.l_2_16.l_2_16_3;

/**
 * Created by Ruble on 09.07.2017.
 */
public class Main
{
    static void foo(int a, int b)
    {
        System.out.println("a = " + a + "; b = " + b + ".");
    }

    static void foo(int ... a)
    {
        for (int i = 0; i < a.length ; i++)
        {
            System.out.println("a [" + i + "] = " + a [i] + ".");
        }

    }

    public static void main(String[] args)
    {
        foo(1,2);


        foo(5,6,7);

    }

}
