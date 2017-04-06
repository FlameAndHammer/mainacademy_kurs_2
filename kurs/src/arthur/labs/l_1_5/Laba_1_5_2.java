package arthur.labs.l_1_5;
import java.util.Scanner;

/**
 * Created by Arthur on 04.03.2017.
 * 1. Write a program which prompts user for the number "x",
 *  reads it from the keyboard, and saves it in an int variable called "x".
 * 2. Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... ,9
 *  and "Other" if x >9, respectively.
 * 3. Use: (a) a "nested-if" statement; (b) a "switch-case" statement.
 * 4. The output shall look like (user input – in green): -Enter number x: 1 -Enter number x: 12 -One - Other
 */
public class Laba_1_5_2 {
    public static void main(String[] args) {

        // using if/else
        System.out.println("Input a number  ");
        Scanner number1 = new Scanner(System.in);
        int n1 = number1.nextInt();
        if (n1==1) System.out.println("one");
        else if (n1==2) System.out.println("two");
        else if (n1==3) System.out.println("three");
        else if (n1==4) System.out.println("four");
        else if (n1==5) System.out.println("five");
        else if (n1==6) System.out.println("six");
        else if (n1==7) System.out.println("seven");
        else if (n1==8) System.out.println("eight");
        else if (n1==9) System.out.println("nine");
        else System.out.println("other");

        // using switch/case
        System.out.println("Input one more number ");
        Scanner number2 = new Scanner(System.in);
        int n2 = number2.nextInt();
        switch (n2) {
            case 1: System.out.println("one");
                break;
            case 2: System.out.println("two");
                break;
            case 3: System.out.println("three");
                break;
            case 4: System.out.println("four");
                break;
            case 5: System.out.println("five");
                break;
            case 6: System.out.println("six");
                break;
            case 7: System.out.println("seven");
                break;
            case 8: System.out.println("eight");
                break;
            case 9: System.out.println("nine");
                break;
            default: System.out.println("other");
                break;
        }
    }
}
