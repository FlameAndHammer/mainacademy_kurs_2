package ovanes.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by User on 12.03.2017.
 */
public class onefivetwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.print("Enter your number i:  ");
        i = sc.nextInt();
        if (i == 1) {
            System.out.println("One");
        } else if (i == 2) {
            System.out.println("Two");
        } else if (i == 3) {
            System.out.println("Three");
        } else if (i == 4) {
            System.out.println("Four");
        } else if (i == 5) {
            System.out.println("Five");
        } else if (i == 6) {
            System.out.println("Six");
        } else if (i == 7) {
            System.out.println("Seven");
        } else if (i == 8) {
            System.out.println("Eight");
        } else if (i == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }

        System.out.print("Enter your number i:  ");
        i = sc.nextInt();
        switch (i) {
            case 1: System.out.println("One");
            break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("Three");
            break;
            case 4: System.out.println("Four");
            break;
            case 5: System.out.println("Five");
            break;
            case 6: System.out.println("Six");
            break;
            case 7: System.out.println("Seven");
            break;
            case 8: System.out.println("Eight");
            break;
            case 9: System.out.println("Nine");
            break;
            default: System.out.println("Other");
        }
    }
}