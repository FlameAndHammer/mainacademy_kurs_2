package ovanes.labs.l_1_6;

/**
 * Created by User on 23.03.2017.
 */
public class onesixthree {
    public static void main(String[] args) {
        int[][] matr = new int[5][4];
        for (int i = 1; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = 4*j + i;
            }
        }
        for (int i = 1; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.print(matr[i][j]+ "\t");

            }
            System.out.println();
        }


    }
}

