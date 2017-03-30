package artur.labs.l_2_2_1_and_l_2_2_2;

/**
 * Created by Arthur on 29.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        int range = 7;
        Matrix matrix = new Matrix();
        matrix.setRange(range);

        int[][] matrix1 = new int[range][range];
        int[][] matrix2 = new int[range][range];

        for (int row = 0; row < range; row++) { // filing matrices
            for (int col = 0; col < range; col++) {
                matrix1[row][col] = (int) (Math.random() * 100);
                matrix2[row][col] = (int) (Math.random() * 100);
            }
        }
        matrix.setMatrix1(matrix1);
        matrix.setMatrix2(matrix2);
        matrix.view();
    }
}
