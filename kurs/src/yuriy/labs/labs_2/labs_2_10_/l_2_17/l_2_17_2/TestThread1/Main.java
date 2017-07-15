package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_2.TestThread1;

/**
 * Created by Ruble on 11.07.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("------ B O M B -------");
        MyTimeBomb bomb1 = new MyTimeBomb();
        Thread thread1 = new Thread();
        bomb1.run();
        thread1.start();

    }
}
