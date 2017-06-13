package yuriy.labs.l_2_02.LabWork2_2_1__2;

import java.util.Scanner;

/**
 * Created by Ruble on 02.04.2017.
 */

public class Main {

    public static void main(String[] args) {



        Matrix matrix = new Matrix();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of matrix1 -> ");
        matrix.setLength(sc.nextInt());
        matrix.setMatrix1(matrix.PushMatrix(matrix.length));
        matrix.setMatrix2(matrix.PushMatrix(matrix.length));

        matrix.matrixViewAll();

    }
}
