package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_3.TestThread2;

/**
 * Created by Ruble on 11.07.2017.
 */



public class Main
{
    public static void main(String[] args)
    {
        int[] myArray = new int[1000];
        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();

        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = (int) (Math.random()*(1001));
            System.out.println(myArray[i]);
        }

        mySumCount1.setStartIndex(0);
        mySumCount1.setStopIndex(myArray.length/2);
        mySumCount1.setArrayOfInteger(myArray);

        mySumCount2.setStartIndex(myArray.length/2 + 1);
        mySumCount2.setStopIndex(myArray.length);
        mySumCount2.setArrayOfInteger(myArray);


        Thread thread1 = new Thread(); //дополнительные треды создавать не нужно
        Thread thread2 = new Thread(); //потому что MySumCount наследуется от тред
                                       //но если создаешь то передай им нужную работу
        thread1.start();               //потому что эти потоки ничего не делают
        thread2.start();               //когда запускаются

        mySumCount1.run();             //а вызов метода run выполняет работу в основном потоке
        mySumCount2.run();             //и получается что работа проходит не паралельно в разных потоках
                                       //а последовательно в одном и том же потоке, а два потока запускаются пустыми

        System.out.print("Sum of array elements1: ");
        System.out.println (mySumCount1.resultSum);

        System.out.print("Sum of array elements2: ");
        System.out.println (mySumCount2.resultSum);

        System.out.print("Sum of all array elements: ");
        System.out.println (mySumCount1.resultSum + mySumCount2.resultSum);
    }
}
