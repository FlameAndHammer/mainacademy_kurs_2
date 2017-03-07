package kirill.labs.l_1_4;

import java.util.Scanner;

/**
 * Created by Storm on 01.03.2017.
 */
public class Labs147 {
    public static void main(String[] args) {
        System.out.println("Task: Write a console program that prints result of Ternary operator for integer variable initialization.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a = ");
        int a = sc.nextInt();

        System.out.println("Enter b");
        int b = sc.nextInt();

        boolean flag = true;
        boolean cond = false;
        System.out.println("Value flag = " + flag + '\n' + "Value cond = " + cond);

        int c = flag? a:b;
        System.out.println("flag = " + c);

        int d = cond? a:b;
        System.out.println("cond = " + d);

    }
}
