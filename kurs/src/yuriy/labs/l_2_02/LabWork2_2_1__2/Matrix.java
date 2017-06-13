package yuriy.labs.l_2_02.LabWork2_2_1__2;

/**
 * Created by Ruble on 01.04.2017.
 */
public class Matrix {

    public int length;
    public void setLength(int length) { this.length = length; }

    public int [][] matrix1 = PushMatrix (length);
    public int [][] matrix2 = PushMatrix (length);

    public void setMatrix1(int[][] matrix1) { this.matrix1 = matrix1; }
    public void setMatrix2(int[][] matrix2) { this.matrix2 = matrix2; }

    public  int[][] PushMatrix (int length) {
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++){
            for (int y = 0; y < length; y++){
                array[i][y] = (int) (Math.random () * 100);
            }
        }
        return array;

    }

    private int[][] SumMatrix () {

        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int y = 0; y < col; y++){

                result[i][y] = matrix1[i][y] + matrix2[i][y];
            }
        }
        return result;

    }

    private int[][] MultiplicationMatrix () {

        int m1rows = matrix1.length;
        int m1cols = matrix1[0].length;
       // int m2rows = matrix2.length;
        int m2cols = matrix2[0].length;

        int[][] result = new int[m1rows][m2cols];
        for (int i = 0; i < m1rows; i++) {
            for (int j = 0; j < m2cols; j++) {
               for (int k = 0; k < m1cols; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
               }
            }
        }
        return result;
    }

    public static void matrixView (int [][] matrix){
        int mRow = matrix.length;
        int mCol = matrix[0].length;

        for (int i = 0; i < mRow; i++){
            for (int y = 0; y < mCol; y++){
               System.out.print("\t" + matrix[i][y]);
            }
              System.out.println();
        }
        System.out.println();
    }
    public void matrixViewAll (){
        System.out.println("matrix1:");
        matrixView (matrix1);
        System.out.println("matrix2:");
        matrixView (matrix2);
        System.out.println("SumMatrix:");
        matrixView (SumMatrix ());
        System.out.println("MultiplicationMatrix:");
        matrixView (MultiplicationMatrix ());

    }
}


