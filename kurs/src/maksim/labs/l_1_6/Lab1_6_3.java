package maksim.labs.l_1_6;

import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_6_3 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Enter digit #" + (j + 1) + " for row #" + (i + 1) + ": ");
                Scanner sc = new Scanner(System.in);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }

    }
}
