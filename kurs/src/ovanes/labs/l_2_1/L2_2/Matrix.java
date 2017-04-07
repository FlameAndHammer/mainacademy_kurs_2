package ovanes.labs.l_2_1.L2_2;

/**
 * Created by User on 06.04.2017.
 */
public class Matrix {
    public  int [][] add (int [][] matrix_A, int [][] matrix_B) {
        int size = matrix_A.length;
        int [][] sum = new int [size][size];
        for (int i = 0; i <sum.length; i++) {
            for (int j=0; j<sum[i].length; j++) {
                sum [i][j] = matrix_A[i][j] + matrix_B [i][j];
            }
        }
        return sum;

    }
    public  int [][] mult (int [][] matrix_A, int [][] matrix_B) {
        int size = matrix_A.length;
        int [][] mult = new int [size][size];
        for (int i=0; i<mult.length; i++) {
            for (int j=0; j<mult[i].length; j++){
                for (int k=0; k<size;k++){
                    mult[i][j] += matrix_A [i][k]*matrix_B [k][j];
                }
            }
        }
        return  mult;
    }
    public void printMatrix (int [][]array) {
        for (int []row :array){
            for (int value:row){
                System.out.println(value + "\t");

            }
            System.out.println();
        }
    }
}
