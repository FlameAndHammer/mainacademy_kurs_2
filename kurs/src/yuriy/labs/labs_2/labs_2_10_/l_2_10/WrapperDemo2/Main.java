package yuriy.labs.labs_2.labs_2_10_.l_2_10.WrapperDemo2;

import java.util.Scanner;

/**
 * Created by Ruble on 21.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_10_2 by Yuriy Denezhko:\n");
        System.out.print("Enter the first argument: ");
        Scanner sc = new Scanner(System.in);
        Number arg1 = sc.nextInt();

        System.out.print("Enter the second argument: ");
        Number arg2 = sc.nextInt();

        System.out.println("\n" + "arg1 + arg2 = " + compute(arg1,arg2));

    }
     static Number compute(Number arg1, Number arg2){
         Long result = arg1.longValue() + arg2.longValue();

        return result;
     }
}
