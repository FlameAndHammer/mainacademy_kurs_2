package _nikulin.labs.lab_2_2_1__2_2_2;

public class Matrix {

    public int[][] add(int[][] matrix_1, int[][] matrix_2) {
        int size = matrix_1.length;
        int[][] sum = new int[size][size];
        for (int i=0; i<sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
        return sum;
    }

    public int[][] mult(int[][] matrix_1, int[][] matrix_2) {
        int size = matrix_1.length;
        int[][] mult = new int[size][size];
        for (int i=0; i<mult.length; i++) {
            for (int j = 0; j < mult[i].length; j++) {
                for (int k = 0; k < size; k++) {
                    mult[i][j] += matrix_1[i][k] * matrix_2[k][j];
                }
            }
        }
        return  mult;
    }
    public void printMatrix(int[][] array) {
        for(int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
