package yuriy.labs.lab_2_4;

import java.util.Scanner;

/**
 * Created by Ruble on 06.04.2017.
 */
/*

Lab Work 2-4-6
        Write a class MyPyramid with public static method printPyramid(int h) that takes
        parameter an integer h between 1 and 9, and prints a pyramid of numbers of height h.
        Example: For h = 4 the method should print the pyramid
           1
          121
         12321
        1234321
*/

public class MyPyramid {
    public static void printPyramid(int h){

        for (int i = 1; i <= h; i++){
            for (int y = 0; y <= (h - i); y++){
                System.out.print(" ");
            }
            for (int z = 1; z <= (i); z++){
                System.out.print(z);
            }
            for (int z = (i - 1); z >= (1); z--){
                System.out.print(z);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        System.out.println("LabWork_2_4_6 by Yuriy Denezhko:");
        System.out.println();
        System.out.print("Enter the height of pyramid an integer (1-9) -> ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        if ((h <= 0) || (h > 9)) {System.out.println("This height not in range (1-9)"); }
        else {MyPyramid.printPyramid(h);}
    }
}