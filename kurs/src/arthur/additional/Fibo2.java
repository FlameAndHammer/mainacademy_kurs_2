package arthur.additional;

import java.util.Scanner;

/**
 * Created by Arthur on 12.04.2017.
 *  * Print n-number of Fibonacci  sequence:
 * 1 1 2 3 5 8 13 21 34 55 89 144
 * by Recursion
 *
 */
public class Fibo2 {
    static int number = 1;
    static int temp = 0;
    static int counter = 0;

    public static int fibo (int n, int counter){
        number += temp;
        temp = number - temp;
        counter ++;
        if (counter < n -1) fibo(n, counter);
        return number;
    }


    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Input a number  ");
            Scanner n1 = new Scanner(System.in);
            n = n1.nextInt();
        } while (n<1);


        System.out.println(fibo(n,counter));
    }
}
