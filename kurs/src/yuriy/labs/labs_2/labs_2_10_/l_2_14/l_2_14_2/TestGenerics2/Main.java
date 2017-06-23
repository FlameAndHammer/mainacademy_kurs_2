package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_2.TestGenerics2;

import java.util.Scanner;

/**
 * Created by Ruble on 20.06.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("-----------------The first array-----------------");
        System.out.print("Enter the length of the first array -> ");
        Scanner sc = new Scanner(System.in);
        int sizeOfArray1 = sc.nextInt();
        Integer [] array1 = new Integer[sizeOfArray1];
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = (int) ( Math.random() * 100 );
            System.out.println(array1[i]);
        }
        System.out.print("Enter the first maxElem -> ");
        int maxElem1 = sc.nextInt();
        System.out.print("The number of elements in the first of array that are greater than maxElem = ");
        System.out.println(MyTestMethod.calcNum(array1,maxElem1));
        System.out.println();

        System.out.println("-----------------The second array-----------------");
        System.out.print("Enter the length of the second array -> ");
        int sizeOfArray2 = sc.nextInt();

        Double [] array2 = new Double[sizeOfArray2];
        for (int i = 0; i < array2.length; i++)
        {
            array2[i] = (double) ( Math.random() * 100 );
            System.out.println(array2[i]);
        }

        System.out.print("Enter the second maxElem -> ");
        Double maxElem2 = sc.nextDouble();
        sc.close();
        System.out.print("The number of elements in the first of array that are greater than maxElem = ");
        System.out.println(MyTestMethod.calcNum(array2,maxElem2));

    }
}
