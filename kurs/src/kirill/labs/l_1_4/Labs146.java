package kirill.labs.l_1_4;

import java.util.Scanner;

/**
 * Created by Storm on 01.03.2017.
 */
public class Labs146 {
    public static void main(String[] args) {
        System.out.println("Task: Write a console program that prints result of Bitwise operators for two integer variables.");
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a ");
        a = sc.nextInt ();

        System.out.println("Enter value b ");
        b = sc.nextInt ();

        System.out.println("Value a = " + a + '\n' + "Value b = " + b);

        System.out.println("Bitwise operators AND-&, OR-|, NOT- ~, XOR-^");

        System.out.println("Operator AND");
        int c = a & b;
        System.out.println("Result a&b = " +c);

        System.out.println("Opertor OR");
        int d = a | b;
        System.out.println("Result a|b = " + d);

        System.out.println("Operator NOT");
        int e = ~a;
        System.out.println("Result ~a = " + e);

        System.out.println("Operator NOT");
        int f = ~b;
        System.out.println("Result ~b = " + f);

        System.out.println("Operator XOR");
        int g = a ^ b;
        System.out.println("Result a^b = " + g);

    }
}
