package yuriy.labs.labs_2.labs_2_10_.l_2_16.l_2_16_5;

/**
 * Created by Ruble on 09.07.2017.
 */
public class Main
{
    static void foo(int a)
    {
        System.out.println("int");
    }
    static void foo(byte b)
    {
        System.out.println("byte");
    }

    public static void main(String[] args)
    {
        byte b = 5;
        foo(b);
        foo(5);

    }
}
