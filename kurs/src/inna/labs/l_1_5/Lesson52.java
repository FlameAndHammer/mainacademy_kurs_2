package inna.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by ИННА on 12.03.2017.
 */
public class Lesson52 {
    public static void main(String[] args) {
        String number = "";
        System.out.print("-Enter number x: ");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();

        switch (x) {
            case 1: number = "One";
                break;
            case 2: number = "Two";
                break;
            case 3: number = "Three";
                break;
            case 4: number = "Four";
                break;
            case 5: number = "Five";
                break;
            case 6: number = "Six";
                break;
            case 7: number = "Seven";
                break;
            case 8: number = "Eight";
                break;
            case 9: number = "Nine";
                break;
            default: number = "Other";
        }
        System.out.println("-" + number);


        if (x == 1) {
            number = "one";
        }
        else if (x==2) {
            number = "Two";
        }
        else if (x==3) {
            number = "Three";}
        else if (x==4) {
            number = "Four";
        }
        else if (x==5) {
            number = "five";}
        else if (x==6) {
            number = "six";}
        else if (x==7) {
            number = "seven";}
        else if (x==8) {
            number = "eight";}
        else if (x==9) {
            number = "nine";}
        else {
            number = "other";
        }
        System.out.println("*" + number);
    }
}
