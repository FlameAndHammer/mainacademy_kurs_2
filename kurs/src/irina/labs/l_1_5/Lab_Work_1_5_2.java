package irina.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by epub on 3/5/2017.
 */
public class Lab_Work_1_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Please enter the number");

        if(sc.hasNextInt()){
            i = sc.nextInt();

            String number;
            switch (i) {
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
            System.out.println(number);
        }
        }
    }
