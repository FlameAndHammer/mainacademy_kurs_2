package artur.labs.l_2_4;

import java.util.Scanner;

/**
 * Created by Arthur on 04.04.2017.
 * The value of π can be calculated with the series: π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 * Write a class MyCalc with public static method calcPi(int) that takes as parameter an integer n,
 * and computes and returns the value of π approximated to the first n terms of the series.
 */
public class MyCalc {
    public static double calcPi (int n){
        double sequence = 0;
        for (int i=1; i<=n; i++){
            sequence +=  Math.pow(-1,i) * 4 / (i*2 + 1) ; //@Nikulin interesting idea to change sign
        }
        double pi = 4 + sequence ;
        return pi;
    }

    public static void main(String[] args) {
        System.out.println("Input a number  ");
        Scanner number1 = new Scanner(System.in);
        int n = number1.nextInt();
        System.out.println("Pi: " + calcPi(n));
    }
}
