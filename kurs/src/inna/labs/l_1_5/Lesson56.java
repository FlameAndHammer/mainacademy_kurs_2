package inna.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by ИННА on 13.03.2017.
 */
public class Lesson56 {
    public static void main(String[] args) {
        System.out.print("Enter ");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        for (int num=1; num < x; num++ ){
            if (x%num==0){
                System.out.println( num);
            }
        }


    }
}
