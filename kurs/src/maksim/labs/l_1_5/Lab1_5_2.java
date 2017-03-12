package maksim.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Пк on 06.03.2017.
 */
public class Lab1_5_2 {
    public static void main(String[] args) {
        System.out.println("Enter your lucky digit:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x <=9) {
            String dig = "";
             switch (x) {
                 case 0: dig="Zero";
                 break;
                 case 1: dig="One";
                 break;
                 case 2: dig="Two";
                 break;
                 case 3: dig="Three";
                 break;
                 case 4: dig="Four";
                 break;
                 case 5: dig="Five";
                 break;
                 case 6: dig="Six";
                 break;
                 case 7: dig="Seven";
                 break;
                 case 8: dig="Eight";
                 break;
                 case 9: dig="Nine";
                 break;
             }
            System.out.println("So, your lucky digit is " + dig + ". Mine too ;)");
        }
        else {
            System.out.println("It's a number, not a digit. Try again.");
        }
    }
}
