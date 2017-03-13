package maksim.labs.l_1_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_6_7 {
    public static void main(String[] args) {
        int[][] equalsArray;
        System.out.println("Enter the number of rows you want:");
        Scanner scr = new Scanner(System.in);
        int rows = scr.nextInt();
        System.out.println("Enter the number of columns you want:");
        Scanner scc = new Scanner(System.in);
        int cols = scc.nextInt();
        equalsArray = new int[rows][cols];
        System.out.println("Enter desired numbers. Use several similar numbers.");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter number for cell #" + (j + 1) + " of row #" + (i + 1) + ": ");
                Scanner sc = new Scanner(System.in);
                equalsArray[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Your matrix:");
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(Arrays.toString(equalsArray[i]));
            System.out.println();
        }
        System.out.println();
        System.out.println("Enter the number that we are looking for:");
        Scanner s = new Scanner(System.in);
                int counts = 0;
                int k = s.nextInt();
                System.out.println("Let's found equals for your number " + k);
                for (int i = 0; i < rows; i++) {
                    System.out.print("In row " + (i + 1) + " there are equals for " + k + " in cells:");
                    for (int j = 0; j < cols; j++) {
                        if (k == equalsArray[i][j]) {
                            ++counts;
                            System.out.print(" #" + (j + 1));
                        }

                    }
                    System.out.println();
                }
                System.out.println("Total quantity of \"" + k + "\" is " + counts);
                System.out.println();
            }

        }


