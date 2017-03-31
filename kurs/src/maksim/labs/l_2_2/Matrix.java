package maksim.labs.l_2_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Пк on 30.03.2017.
 */
public class Matrix {
        int row = 3;
        int col = 4;
        int[][] mtrx1 = new int[row][col];
        int[][] mtrx2 = new int[row][col];
        int[][] sum = new int[row][col];
        int[][] multi = new int[row][col];

        public int[][] setMatrix1(){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    mtrx1[i][j] = (int)(Math.random() * 100);
                }
            }
            return mtrx1;
        }
        public int[][] setMatrix2(){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    mtrx2[i][j] = (int)(Math.random() * 100);
                }
            }
            return mtrx2;
        }
        public int[][] sumMatrix(){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    sum[i][j] = mtrx1[i][j] + mtrx2[i][j];
                }
            }
            return sum;
        }
        public int[][] multiMatrix(){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++){
                    multi[i][j] = mtrx1[i][j] * mtrx2[i][j];
                }
            }
            return multi;
        }
        public void view(){
            System.out.println("\t Matrix 1");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("\t" + mtrx1[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("\t Matrix 2");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("\t" + mtrx2[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("\t Sum of Matrices");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("\t" + sum[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("\t Multiplication of Matrices");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("\t" + multi[i][j] + "  ");
                }
                System.out.println();
            }
        }
}
