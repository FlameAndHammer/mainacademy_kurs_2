package maksim.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_5_7_correct_formula {
    public static void main(String[] args) {
        System.out.println("Enter the number till what we will find all perfect numbers.");
        System.out.print("For example, 35 million (35000000) : ");
        Scanner sc = new Scanner(System.in);
        long endNumber = sc.nextInt();
        int div;
        int its1 = 1;
            for (double p = 2; p < 100; p++) {
                double mp = Math.pow(2, p) - 1;
                for (int smpl = 2; smpl < p; smpl++) {
                    div = (int) (mp % smpl);
                    its1 *= div;
                }
                if (its1 != 0) {
                    double mp2 = Math.pow(2, p - 1);
                    long perfectNumber = (long) (mp * mp2);
                    if (perfectNumber < endNumber) {
                        System.out.println("I found the perfect number: " + perfectNumber);
                    }
                }
                its1 = 1;
        }
    }
}




