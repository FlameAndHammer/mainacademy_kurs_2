package _nikulin.labs.lab_1_6_7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arrayTwoInt = {{7,7,4,7,7},
                               {9,0,5,7,7},
                               {1,2,7,9,8},
                               {3,7,7,7,5},
                               {7,0,7,2,7}};
        Scanner sc = new Scanner(System.in);

        System.out.println("ArrayTwoDimensional:");
        for (int i=0; i<arrayTwoInt.length; i++) {
            System.out.println(Arrays.toString(arrayTwoInt[i]));
        }

        System.out.print("\nEnter number for search -> ");
        int number = sc.nextInt();

        for (int i=0; i<arrayTwoInt.length; i++) {
            int[] aux = new int[arrayTwoInt[i].length];
            int k = 0;

            for (int j = 0; j < arrayTwoInt[i].length; j++) {
                if (arrayTwoInt[i][j] == number) {
                    aux[k++] = j;
                }
            }

            System.out.print("Line " + (i + 1) + ": [");
            if (k != 0) {
                if (k == 1) {
                    System.out.print(aux[0]);
                } else {
                    int pos = 0;
                    boolean flagStart = false;
                    while (pos < (k-1)) {
                        if (aux[pos + 1] - aux[pos] != 1) {
                            if (flagStart) {
                                flagStart = false;
                            }
                            System.out.print(aux[pos] + ",");
                        } else if (flagStart == false){
                            flagStart = true;
                            System.out.print(aux[pos] + "-");
                        }
                        pos++;
                    }
                    System.out.print(aux[pos]);
                }
            }
            System.out.println("]");
        }
    }
}
