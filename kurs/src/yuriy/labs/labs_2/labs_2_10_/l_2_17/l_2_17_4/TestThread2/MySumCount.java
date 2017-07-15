package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_4.TestThread2;

/**
 * Created by Ruble on 11.07.2017.
 */
public class MySumCount implements Runnable
{
    int startIndex, stopIndex;
    long resultSum;
    int[] arrayOfInteger;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setArrayOfInteger(int[] arrayOfInteger) {
        this.arrayOfInteger = arrayOfInteger;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < stopIndex ; i++)
        {
            resultSum += arrayOfInteger[i];
        }
       // super.run();
    }
}
