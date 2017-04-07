package olena.labs.L_2_4;
import java.util.Scanner;

/**
 * Created by elenafostachuk on 4/7/17.
 */
import java.util.Scanner;
public class MyCalc {
    public static double calcPI(int count) {
        double pi = 0;
        final int valFour = 4;
        double divider = 1.0;
        for (int i = 1; i <= count; i++, divider += 2) {
            if (i % 2 == 0)
                pi += -valFour / divider;
            else
                pi += valFour / divider;
        }
        return pi;
    }


    public static void main(String[] args) {
        System.out.print("Input some number");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        System.out.println(calcPI(n));
    }
}



