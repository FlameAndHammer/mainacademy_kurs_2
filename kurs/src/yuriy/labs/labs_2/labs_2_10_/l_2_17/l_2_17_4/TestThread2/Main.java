package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_4.TestThread2;

/**
 * Created by Ruble on 11.07.2017.
 */




/*

---------------------------  ГДЕ ЗДЕСЬ ИСПОЛЬЗОВАТЬ join() method? -------------------------


        Remind that student should apply his or her knowledge of:
        • how to create a thread, how to use join() method;
        Execute following steps:
        • Add new class MySumCount and provide all necessary code
        • In method main() provide all necessary code to use two instance of
        MySumCount to calculate sum of integer array elements.
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

        mySumCount1.run();  //для того что бы запустить Runnable в новом потоке, нужно создать Thread
        mySumCount2.run();  //эти два Runnable запускаются сейчас в основном потоке последовательно, а не паралельно

        System.out.print("Sum of array elements1: ");
        System.out.println (mySumCount1.resultSum);

        System.out.print("Sum of array elements2: ");
        System.out.println (mySumCount2.resultSum);

        System.out.print("Sum of all array elements: ");
        System.out.println (mySumCount1.resultSum + mySumCount2.resultSum);
    }
}
