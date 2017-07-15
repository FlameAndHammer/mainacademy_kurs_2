package yuriy.labs.labs_2.labs_2_10_.l_2_16.l_2_16_4;

/**
 * Created by Ruble on 09.07.2017.
 */
public class Main
{
    static void foo(Animal a)
    {
        System.out.println("Animal");
    }
    static void foo(Dog d)
    {
        System.out.println("Dog");
    }
    static void foo(Puppy p)
    {
        System.out.println("Puppy");
    }


    public static void main(String[] args)
    {
     foo(null);
    }
}
