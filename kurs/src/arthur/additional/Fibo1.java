package arthur.additional;

import java.util.Scanner;

/**
 * Created by Arthur on 11.04.2017.
 * Print n-number of Fibonacci  sequence:
 * 1 1 2 3 5 8 13 21 34 55 89 144
 * by cycle
 */
public class Fibo1 {
    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Input a number  ");
            Scanner n1 = new Scanner(System.in);
             n = n1.nextInt();
        } while (n<1);


        int number = 1;
        int temp = 0;
        for (int i=1; i<n; i++){
            number += temp;
            temp = number - temp;
        }
        System.out.println(number);
    }
}
