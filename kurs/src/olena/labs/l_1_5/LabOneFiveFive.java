package olena.labs.l_1_5;

/**
 * Created by elenafostachuk on 3/10/17.
 */
public class LabOneFiveFive {
    public static void main(String[] args) {
        int sum = 0;
        int avg =0;
        for (int j = 1; j <= 100; j = j + 1) {
            sum = sum + j;
            avg =sum/j;
        }
        System.out.println("The Sum is:" + sum);
        System.out.println("The Avg is :" + avg);
    }
}
