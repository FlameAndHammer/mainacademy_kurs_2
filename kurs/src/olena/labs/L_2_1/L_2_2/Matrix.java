package olena.labs.L_2_1.L_2_2;

/**
 * Created by elenafostachuk on 4/2/17.
 */
public class Matrix {
     int rows = 3;
     int cols = 4;
     int[][] matr1 = new int[rows][cols];
     int[][] matr2 = new int[rows][cols];
     int[][] matrSum = new int[rows][cols];
     int[][]matrMulti = new int[rows][cols];

     public int[][] setMatrix1() {
          for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {
                    matr1[i][j] =  i + j;
               }
          }
          return matr1;
     }
    public int[][] setMatrix2(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matr2[i][j] =  j + (j+3) ;
            }
        }
        return matr2;
    }
    public int[][] setSumMatrices(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrSum[i][j] = matr1[i][j] + matr1[i][j];
            }
        }
        return matrSum;
    }
    public int[][] setMultiMatrices(){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrMulti[i][j] = matr1[i][j] * matr2[i][j];
            }
        }
        return matrMulti;

    }
    public void view(){
        System.out.println("\t Matrix 1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" + matr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\t  Matrix 2");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" + matr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\t Sum of Matrices");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t" + matrSum[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\t Multiplication of Matrices");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\t\t" + matrMulti[i][j] + "  ");
            }
            System.out.println();
        }
    }
}




















