package olena.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by elenafostachuk on 3/10/17.
 */
public class LabOneFiveSix {
    public static void main(String[] args) {
        System.out.println("enter i in square");
        Scanner sc = new Scanner(System.in);
        String num_input = sc.nextLine();
        int n = 2;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += sum + Math.pow(i, n);
            }
            System.out.println(sum);
        }
    }
