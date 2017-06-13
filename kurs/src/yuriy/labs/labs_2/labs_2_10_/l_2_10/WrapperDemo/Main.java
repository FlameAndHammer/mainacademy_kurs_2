package yuriy.labs.labs_2.labs_2_10_.l_2_10.WrapperDemo;

import java.util.Scanner;

/**
 * Created by Ruble on 21.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_10_1 by Yuriy Denezhko:\n");

        System.out.println("Enter the integer variable:");

        Scanner sc0 = new Scanner(System.in);
        Integer  x = sc0.nextInt();
        String xS = x.toString();


        Integer x1 = x;
        Integer x2 = new Integer(x);
        Integer x4 = Integer.valueOf(x);
        Integer x5 = Integer.parseInt(xS);

        System.out.println("x1 = x2 -> " + (x1 == x2));
        System.out.println("x1 = x4 -> " + (x1 == x4));
        System.out.println("x1 = x5 -> " + (x1 == x5));

        System.out.println("x1 equals(x2) -> " + x1.equals(x2));
        System.out.println("x1 equals(x4) -> " + x1.equals(x4));
        System.out.println("x1 equals(x5) -> " + x1.equals(x5));


    }

}
