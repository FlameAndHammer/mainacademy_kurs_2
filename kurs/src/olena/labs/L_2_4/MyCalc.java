package olena.labs.L_2_4;
import java.util.Scanner;

/**
 * Created by elenafostachuk on 4/7/17.
 */
public class MyCalc {
    public static double calcPI(int n) {
        double s = 0;
        for (int i = 3; i <= n; i++) {
            s = 4 / i + 2 ;
        }
        double pi = 4 + s;
        s++;
        return pi;
    }

    public static void main(String[] args) {
        System.out.print("Input any number");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        System.out.println(calcPI(n));
    }
}



