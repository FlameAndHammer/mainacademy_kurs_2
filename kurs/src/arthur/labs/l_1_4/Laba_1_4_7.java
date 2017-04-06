package arthur.labs.l_1_4;
import java.util.Scanner;

/**
 * Created by Arthur on 04.03.2017.
 * Write a console program
 * that prints result of Ternary operator for integer variable initialization.
 */
public class Laba_1_4_7 {
    public static void main(String[] args) {
        System.out.println("input a number");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int e = (d>0) ?d : -d ;
        System.out.println("the absolute value of the number " +d + " is " +e);
    }
}
