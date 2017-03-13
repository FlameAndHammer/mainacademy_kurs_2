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

        System.out.println("Variant № 1:");
        int array[] = new int[15];
        for (int i = 0; i < 15; i++){
            array[i] = (i + 1 ) * 2;
            System.out.println("array\t[" + i + "] =\t" + array[i]);

        }
        System.out.println();

        System.out.println("Variant № 2:");
        int array1[] = new int[16];
        for (int i = 2; i < 32; i = i + 2){
            array1[i - (i / 2) ] = i;
            System.out.println("array1\t[" + (i - i / 2) + "] =\t" + array1[i - i / 2]);

        }

        System.out.println();

        System.out.println("Variant № 3:");
        int array2[] = new int[30];
        for (int i = 1; i <= 30; i++){
            array2[i - 1] = i;
            if ( array2[i - 1] % 2 == 0){
                System.out.print(array2[i - 1] + " ");
            }
        }
        System.out.println();



    }
}
