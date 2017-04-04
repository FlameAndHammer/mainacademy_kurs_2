package _nikulin.labs.lab_2_2_1__2_2_2;

public class Main {

    public static void main(String[] args) {
	        // lab 2_2_1 and lab_2_2_2
        Matrix matrix = new Matrix();

        int[][] array_1 = {{3, -5}, {1, 4}};
        System.out.println("Matrix_1:");
        matrix.printMatrix(array_1);

        int[][] array_2 = {{1, 2}, {3, 4}};
        System.out.println("\nMatrix_2:");
        matrix.printMatrix(array_2);

        int[][] sumMatrix = matrix.add(array_1, array_2);
        int[][] multMatrix = matrix.mult(array_1, array_2);

        System.out.println("\nAddition matrix:");
        matrix.printMatrix(sumMatrix);
        System.out.println("\nMultiplication matrix:");
        matrix.printMatrix(multMatrix);
    }
}
