package kirill.labs.l_1_4;

import java.util.Scanner;

/**
 * Created by Storm on 01.03.2017.
 */
public class Labs145 {
    public static void main(String[] args) {
        System.out.println("Task:Write a console program that prints result of bit shift operators for integer variable.");

        int a, b, c, g;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter value a");
        a = sc.nextInt();

        System.out.println("Enter value b");
        b = sc.nextInt();

        System.out.println("Enter value c = << ");
        c = sc.nextInt();

        System.out.println("Enter value g");
        g = sc.nextInt();

        System.out.println("Value a= " + a + '\n' + "Value b= " + b + '\n' + "Value c= " + c + '\n' + "Value g= " + g);

        //Bit shift operators <<4
        int d = a << c;
        System.out.println("Value after operation bit shift a<<c = " + d);

        //Bit shift operators >>
        int e = b >> c;
        System.out.println("Value after operation bit sheft b>>c =" + e);

        //Bit shift operators >>>
        int f = g >>> c;
        System.out.println("Value after operation bit sheft g>>>c =" + f);

    }
}
