package yuriy.labs.labs_2.labs_2_10_.l_2_16.l_2_16_2;

/**
 * Created by Ruble on 23.06.2017.
 */
public class Main
{
    static void foo (int i)
    {
        System.out.println("int");
    }


    static void foo (Byte b)
    {
        System.out.println("Byte");
    }

    public static void main(String[] args)
    {
        int i = 5;
        byte b = 12;

        foo(b);


    }

}
