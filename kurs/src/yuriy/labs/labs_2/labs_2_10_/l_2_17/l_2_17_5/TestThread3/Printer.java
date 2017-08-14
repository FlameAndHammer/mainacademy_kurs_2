package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_5.TestThread3;

/**
 * Created by Ruble on 19.07.2017.
 */
public class Printer extends Thread
{

    @Override
    public void run()
    {
        System.out.println(Storage.count);
    }
}
