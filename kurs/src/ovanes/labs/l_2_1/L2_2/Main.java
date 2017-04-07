package ovanes.labs.l_2_1.L2_2;

/**
 * Created by User on 06.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int [][] array_A = {{3,-1},{1,4}};
        System.out.println("Matrix_A: ");
        matrix.printMatrix(array_A);

        int [] [] array_B = {{1,2},{3,4}};
        System.out.println("Matrix_B:");
        matrix.printMatrix (array_B);
        int [][] sumMatrix = matrix.add(array_A,array_B);
        int [][]multMatrix= matrix.mult(array_A,array_B);

        System.out.println("\nAddition matrix: ");
        matrix.printMatrix(sumMatrix);
        System.out.println("\nMultiplication matrix:");
        matrix.printMatrix(multMatrix);
    }
}
