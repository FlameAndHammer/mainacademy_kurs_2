package kirill.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Storm on 17.04.2017.
 */
public class Labs152 {
    public static void main(String[] args) {
        int number;

        System.out.print("Enter value x = ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        String numberStr = null;

        switch (number) {

            case 1:
                numberStr = "One";
                break;

            case 2:
                numberStr = "Two";
                break;

            case 3:
                numberStr = "Three";
                break;

            case 4:
                numberStr = "Four";
                break;

            case 5:
                numberStr = "Five";
                break;

            case 6:
                numberStr = "Six";
                break;

            case 7:
                numberStr = "Seven";
                break;

            case 8:
                numberStr = "Eight";
                break;

            case 9:
                numberStr = "Nime";
                break;

        }

        if (number > 9) {
            System.out.println("Other");
        } else
            System.out.println(numberStr);
    }
}
