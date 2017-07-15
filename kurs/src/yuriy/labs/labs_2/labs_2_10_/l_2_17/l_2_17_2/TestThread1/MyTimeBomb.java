package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_2.TestThread1;

/**
 * Created by Ruble on 10.07.2017.
 */
public class MyTimeBomb implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 10; i > 0 ; i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom!!!");
        //super.run();
    }
}
