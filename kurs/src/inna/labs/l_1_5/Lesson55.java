package inna.labs.l_1_5;

/**
 * Created by ИННА on 13.03.2017.
 */
public class Lesson55 {
    public static void main(String[] args) {
        int num = 1;
        int sumNum = 0;
        for (num = 1; num < 11; num++ ){
        sumNum = sumNum + num;
        }
        System.out.println("The Sum is: " + sumNum);
        System.out.println("The Avg is: " + (sumNum / num) );



    }
}
