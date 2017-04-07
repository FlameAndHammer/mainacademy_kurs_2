package ovanes.labs.l_1_5;
import java.util.Scanner;
/**
 * Created by User on 23.03.2017.
 */
public class onefivesix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter namber -->");
        int number = scanner.nextInt();

        int sum = 0;
        if (number<0)
            number = - number;
        while (number !=0) {
            int digit = number %10;
            sum += digit*digit;
            number /=10;

        }

        System.out.println("Result = " + sum);

    }
}

