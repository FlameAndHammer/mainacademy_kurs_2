package yuriy.labs.l_1_4;

import java.util.Scanner;

/**
 * Created by Ruble on 27.02.2017.
 */
public class LabWork1_4_2 {

    public static void main(String[] args) {

/*
        int primitiveDataTypes1 = 25;
        int primitiveDataTypes2 =5;
*/

     /*   int result1 = primitiveDataTypes1+primitiveDataTypes2;
        int result2 = primitiveDataTypes1-primitiveDataTypes2;
        float result3 = primitiveDataTypes1/primitiveDataTypes2;
        int result4 = primitiveDataTypes1*primitiveDataTypes2;
        int result5 = primitiveDataTypes1%primitiveDataTypes2;
*/

        System.out.println("Введите два целых числа через ENTER");
        Scanner sc = new Scanner(System.in);
        int primitiveDataTypes1 = sc.nextInt();
        int primitiveDataTypes2 = sc.nextInt();



        System.out.println( primitiveDataTypes1+primitiveDataTypes2);
        System.out.println( primitiveDataTypes1-primitiveDataTypes2);
        System.out.println( primitiveDataTypes1/primitiveDataTypes2);
        System.out.println( primitiveDataTypes1*primitiveDataTypes2);
        System.out.println( primitiveDataTypes1%primitiveDataTypes2);

    }
}
