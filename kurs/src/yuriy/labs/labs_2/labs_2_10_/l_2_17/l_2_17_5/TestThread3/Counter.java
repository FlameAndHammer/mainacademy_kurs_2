package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_5.TestThread3;

/**
 * Created by Ruble on 12.07.2017.
 */
public class Counter extends Thread
{
    int count = 0 ;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 1000000 ; i++)
        {
            count++;
        }
       // super.run();
    }
}
