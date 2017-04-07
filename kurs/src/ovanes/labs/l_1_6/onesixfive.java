package ovanes.labs.l_1_6;

/**
 * Created by User on 23.03.2017.
 */
public class onesixfive {
    public static void main(String[] args) {
        int[][]matr = new int[4][];
        int[][]tmatr = new int[4][];

        System.out.println("Matrix:");
        for (int i = 0; i < matr.length; i++) {
            matr[i] = new int[4];
            tmatr[i] = new int[4];
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = (int)Math.round(Math.random()*100);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                tmatr[i][j] = matr[j][i];
            }
        }
        System.out.println("Result:");
        for (int i = 0; i < tmatr.length; i++) {
            for (int j = 0; j < tmatr[i].length; j++) {
                System.out.print(tmatr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


