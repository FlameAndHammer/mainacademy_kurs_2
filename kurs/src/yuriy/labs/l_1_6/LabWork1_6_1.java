package yuriy.labs.l_1_6;

/**
 * Created by Ruble on 09.03.2017.
 */

/*
Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of
        the array to the screen.
*/

public class LabWork1_6_1 {

    public static void main(String[] args) {
        System.out.println("LabWork1_6_1 by Yuriy Denezhko:");
        System.out.println();

        int array[] = new int[15];
        for (int i = 0; i < 15; i++){
            array[i] = (i + 1 ) * 2;
            System.out.println("array\t[" + i + "] =\t" + array[i]);

        }


    }
}
