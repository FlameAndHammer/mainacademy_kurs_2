package maksim.labs.l_1_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_6_5 {
    public static void main(String[] args) {
        int[][] arrayAgain;
        int[][] arrayTransponed;
        System.out.println("How many rows do you want? ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("How many columns do you want? ");
        Scanner sca = new Scanner(System.in);
        int cols = sca.nextInt();
        arrayAgain = new int[rows][cols];
        arrayTransponed = new int [cols][rows];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.println("Enter digit #" + (j + 1) + " for row #" + (i + 1) + ": ");
                Scanner scan = new Scanner(System.in);
                arrayAgain[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Your matrix:");
        for (int i = 0; i < rows; i++){
            System.out.println(Arrays.toString(arrayAgain[i]));
        }
        System.out.println();
        System.out.println("Your matrix transponed:");
        for (int i = 0; i < cols; i++){
            for (int j = 0; j < rows; j++){
                arrayTransponed[i][j] = arrayAgain[j][i];
            }
            System.out.println(Arrays.toString(arrayTransponed[i]));
        }
    }
}
