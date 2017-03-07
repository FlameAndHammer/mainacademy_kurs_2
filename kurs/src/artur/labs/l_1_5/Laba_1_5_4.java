package artur.labs.l_1_5;

/**
 * Created by Arthur on 04.03.2017.
 * The program must print the first 10 numbers
 * that is divisible evenly by 3 or 4,
 * but for loop iterates from 1 to 300 (so break statement must be used after 10 printed result).
 * The output shall look: 3 4 … 20
 */
public class Laba_1_5_4 {
    public static void main(String[] args) {
        System.out.println();
        int j = 1;
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.print(i + " ");
                j++;
            }
            if (j == 11) break;
        }
        System.out.println();
    }
}

