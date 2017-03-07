package _nikulin.labs.lab_1_6_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1},
                          {2, 2, 2, 2},
                          {3, 3, 3, 3},
                          {4, 4, 4, 4}};

        System.out.println("The original matrix:");
        printMatrix(matrix);

        for(int i=0; i<matrix.length; i++) {
            for(int j=i; j<matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("Transposed matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] array2D) {
        for (int[] row : array2D) {
            System.out.println(Arrays.toString(row));
        }
    }
}
