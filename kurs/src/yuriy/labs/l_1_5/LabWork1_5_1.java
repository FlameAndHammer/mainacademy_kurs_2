package yuriy.labs.l_1_5;

/**
 * Created by Ruble on 05.03.2017.
 */

/*Write a program to produce on console the following :
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
        6 5 4 3 2 1
        7 6 5 4 3 2 1
        8 7 6 5 4 3 2 1*/

public class LabWork1_5_1 {
    public static void main(String[] args) {

        String string = "";
        for (int i = 1; i < 9; i++){

            string = string + (i + " ");
            System.out.println(string);

        }



    }
}
