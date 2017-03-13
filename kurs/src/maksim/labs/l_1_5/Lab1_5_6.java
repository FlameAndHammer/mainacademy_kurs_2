package maksim.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_5_6 {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner yn = new Scanner(System.in);
        int yourNum = yn.nextInt();
        int sqsum = 0;
        while (yourNum > 0){
            sqsum += (yourNum % 10) * (yourNum % 10);
            yourNum = yourNum / 10;
        }
        System.out.println("The sum of squares of digits of your number is... " + sqsum);
    }
}
