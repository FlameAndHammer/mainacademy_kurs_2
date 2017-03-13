package yuriy.labs.l_1_6;

/**
 * Created by Ruble on 11.03.2017.
 */

/*

Write a program, which transpose matrix (2d arrays, size 4x4) and outputs it to the
        console

*/

public class LabWork1_6_5 {
    public static void main(String[] args) {

        System.out.println("LabWork1_6_5 by Yuriy Denezhko:");
        System.out.println();


        int[][] array = {{11, 12, 13, 14},{21, 22, 23, 24},{31, 32, 33, 34},{41, 42, 43, 44}};

        System.out.println("The source matrix is:");
        for (int i = 0; i < array.length; i++){
            for (int y = 0; y < array.length; y++){
                System.out.print("\t" + array[i][y]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("The transpose matrix is:");

        int transposeArray[][] = new int[4][4];

        for (int i = 0; i < array.length; i++){
            for (int y = 0; y < array.length; y++){
                transposeArray[i][y] = array[y][i];
                System.out.print("\t" + transposeArray[i][y]);
            }
            System.out.println();
        }


    }
}
