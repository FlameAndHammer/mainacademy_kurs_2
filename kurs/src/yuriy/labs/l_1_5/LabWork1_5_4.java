package yuriy.labs.l_1_5;

/**
 * Created by Ruble on 05.03.2017.
 */

/*The program must print the first 10 numbers that is divisible evenly by 3 or 4, but for
        loop iterates from 1 to 300 (so break statement must be used after 10 printed result).
        The output shall look:
        3 4 …
        20*/

public class LabWork1_5_4 {
    public static void main(String[] args) {
        byte count = 0;
        for (int i = 1; i < 301; i++){
            if ((i % 4 == 0) || (i % 3 == 0)){
                System.out.print(i + " ");
                count++;
                if (count == 10){break;}
            }
        }
    }
}
