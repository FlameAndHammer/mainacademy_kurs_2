package yuriy.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Ruble on 05.03.2017.
 */

     /*   1. Write a program which prompts user for the number "x", reads it from the keyboard,
        and saves it in an int variable called "x".
        2. Then prints "One", "Two",... , "Nine" if the variable "x" is 1, 2,... , 9 and "Other" if x
        >9, respectively.
        3. Use: (a) a "nested-if" statement;
        (b) a "switch-case" statement.
        4. The output shall look like (user input – in green):
        -Enter number x: 1 -Enter number x: 12
        -One - Other*/

public class LabWork1_5_2 {

    public static void main(String[] args) {

        int x = 0;
        String string = "";

        System.out.println("Enter the number:");
        Scanner sc0 = new Scanner(System.in);
         outer:

        if(sc0.hasNextInt()) {x = sc0.nextInt();}
        else {System.out.println("It’s not integer");
            break outer;}

        switch ( x ){
            case 1:string = "One";
                break;
            case 2:string = "Two";
                break;
            case 3:string = "Three";
                break;
            case 4:string = "Four";
                break;
            case 5:string = "Five";
                break;
            case 6:string = "Six";
                break;
            case 7:string = "Seven";
                break;
            case 8:string = "Eight";
                break;
            case 9:string = "Nine";
                break;
            default:string = "Other";
                break;

        }
        System.out.println(string);


}
}
