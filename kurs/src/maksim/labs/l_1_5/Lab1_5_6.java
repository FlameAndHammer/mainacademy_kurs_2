package maksim.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_5_6 {
    public static void main(String[] args) {
        System.out.println("Enter your number (please not bigger than 999):");
        Scanner yn = new Scanner(System.in);
        int yourNum = yn.nextInt();
        int hund = yourNum / 100;
        int dec = yourNum / 10 % 10;
        int ones = yourNum % 100 % 10;
        int sqsum = hund*hund + dec*dec + ones*ones;
        System.out.println("The sum of squares of digits of your number is... " + sqsum);
    }
}
