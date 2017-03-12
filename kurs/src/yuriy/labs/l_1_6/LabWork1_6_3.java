package yuriy.labs.l_1_6;

/**
 * Created by Ruble on 09.03.2017.
 */

/*Write a program, which creates square matrix like those in the figure below and prints
        them formatted to the console. The size of the matrix is 4 x 4:
        1 5 9  13
        2 6 10 14
        3 7 11 15
        4 8 12 16*/

public class LabWork1_6_3 {
    public static void main(String[] args) {
        System.out.println("LabWork1_6_3 by Yuriy Denezhko:");
        System.out.println();

        int array[][] = new int[4][4];

        array[0][0] = 1;
        System.out.print("\t" + array[0][0]);

        for (int i = 1; i < array.length; i++){

            array[0][i] = array[0][i-1] + 4;
            System.out.print("\t" + array[0][i]);
        }
        System.out.println();

        for (int i = 1; i < array.length; i++){

            for (int y = 0; y < 4; y++){

                array[i][y] = array[i - 1][y] + 1;
                System.out.print("\t" + array[i][y]);
            }

            System.out.println();

        }


    }
}
