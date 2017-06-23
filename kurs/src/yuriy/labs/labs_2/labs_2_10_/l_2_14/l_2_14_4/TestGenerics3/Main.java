package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_4.TestGenerics3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ruble on 23.06.2017.
 */
public class Main
{
    public static void main(String[] args) {
        System.out.print("Enter the length of the first array -> ");
        Scanner sc = new Scanner(System.in);
        int sizeOfArray1 = sc.nextInt();
        Integer [] array1 = new Integer[sizeOfArray1];
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = i;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("---------------------shuffle elements of array-----------------------------");


        MyMixer mixer1 = new MyMixer(array1);
        mixer1.shuffle();
        System.out.println(mixer1.toString());


        String [] array2 = {"null", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};

        System.out.println(Arrays.toString(array2));
        System.out.println("---------------------shuffle elements of array-----------------------------");
        MyMixer mixer2 = new MyMixer(array2);
        mixer2.shuffle();
        System.out.println(mixer2.toString());

    }
}
