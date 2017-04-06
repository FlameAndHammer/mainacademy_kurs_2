package arthur.labs.l_2_2_1_and_l_2_2_2;

/**
 * Created by Arthur on 28.03.2017.
 * Create a Matrix class that contains the methods of addition
 * and multiplication of matrices (work with two-dimensional arrays);
 * Write class Main that creates instances of class Matrix and executes its methods.
 */
public class Matrix {
    private int range;    // matrix range
    private int[][] matrix1;
    private int[][] matrix2;

    public void setRange(int range) {
        this.range = range;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }

    public int[][] matrixSum() { // method of adding matrices together
        int[][] result = new int[range][range];
        for (int row = 0; row < range; row++)
            for (int col = 0; col < range; col++)
                result[row][col] = matrix1[row][col] + matrix2[row][col];
        return result;
    }

    public int[][] matrixMultiply(){ // method of multiplying matrices together
        int[][] result = new int[range][range];
        for (int row = 0; row < range; row++)
            for (int col = 0; col < range; col++) {
                result[row][col] = 0;
                for (int column = 0; column < range; column++) // one more cycle for columns
                    result[row][col] = result[row][col] +  matrix1[row][column] * matrix2[column][col] ;
            }
        return result;
    }

        public void view (){
        System.out.println();
        System.out.println("\t\t\tMatrix1\t\t\t\t\t\t\t\tMatrix2\t\t\t\t\t\t\tSum\t\t\t\t\t\t\t\t\t\t\tMultiply ");
            int matrixSum[][] = matrixSum();// call the method of Sum
            int matrixMultiply[][] = matrixMultiply();// call the method of Multiplying

        for (int row = 0; row < range; row++) { // output of matrix1
            for (int col = 0; col < range; col++) {
                System.out.print(matrix1[row][col]);
                System.out.print("\t");
            }
            System.out.print("\t\t"); // output of matrix2
            for (int col = 0; col < range; col++) {
                System.out.print(matrix2[row][col]);
                System.out.print("\t");
            }
            System.out.print("\t\t"); // output of sum of matrices
            for (int col = 0; col < range; col++) {
                System.out.print(matrixSum[row][col]);
                System.out.print("\t");
            }
            System.out.print("\t\t"); // output of multiplying of matrices
            for (int col = 0; col < range; col++) {
                System.out.print(matrixMultiply[row][col]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}