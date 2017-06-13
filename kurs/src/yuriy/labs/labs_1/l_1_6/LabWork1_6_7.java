package yuriy.labs.labs_1.l_1_6;

import java.util.Scanner;

/**
 * Created by Ruble on 11.03.2017.
 */
/*

Write a program, which finds in a given matrix the area of equal numbers. Here is one
        example with an area containing 7 elements with equal value of 1:
        The program must print to console:

        1 1 1 3 4
        2 1 3 1 2
        2 2 3 4 1
        3 3 3 1 4

        Line 1: [0-2]
        Line 2: [1,3]
        Line 3: [4]
        Line 4: [3]
*/

public class LabWork1_6_7 {
    public static void main(String[] args) {

        System.out.println("LabWork1_6_7 by Yuriy Denezhko:");
        System.out.println();

        System.out.println("Enter the number of columns:");
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();

        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();

        int[][] array = new int[col][row];

        for (int i = 0; i < col; i++){
            for (int y = 0; y < row; y++){
                array[i][y] = (int) (Math.random () * 5);
                System.out.print("\t" + array[i][y]);
            }
            System.out.println();
        }


        System.out.println("Enter the number for search:");
        int number = sc.nextInt();


        for (int i = 0; i < col; i++){
            int[] arr1 = new int[array[i].length];
            int key = 0;

            for (int y = 0; y < array[i].length; y++){
                if (array[i][y] == number){
                    arr1[key++] = y;
                }
            }

            System.out.print("Line " + (i + 1) + ": [");
            if (key != 0) {
                if (key == 1) {
                    System.out.print(arr1[0]);
                } else {
                    boolean flagStart = false;
                    int pos = 0;
                    while (pos < (key-1)) {
                        if (arr1[pos + 1] - arr1[pos] != 1) {
                            if (flagStart) {
                                flagStart = false;
                            }
                            System.out.print(arr1[pos] + " , ");
                        } else if (flagStart == false){
                            flagStart = true;
                            System.out.print(arr1[pos] + " - ");
                        }
                        pos++;
                    }
                    System.out.print(arr1[pos]);
                }
            }
            else { System.out.print(" - "); }
            System.out.println("]");

        }

    }
}
