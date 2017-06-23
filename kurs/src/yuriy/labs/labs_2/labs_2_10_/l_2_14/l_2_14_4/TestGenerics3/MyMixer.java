package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_4.TestGenerics3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ruble on 22.06.2017.
 */
public class MyMixer <T>
{
    T [] array;

    public MyMixer(T[] array)
    {
        this.array = array;
    }
    public void shuffle()
    {
        Random rnd = new Random();
        for (int i = 1; i < array.length; i++)
        {
            int j = rnd.nextInt(i);
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(array) ;
    }
}
