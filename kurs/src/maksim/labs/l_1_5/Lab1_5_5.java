package maksim.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_5_5 {
    public static void main(String[] args) {
        System.out.println("Enter the number till what we will count the sum:");
        Scanner num = new Scanner(System.in);
        int limit = num.nextInt();
        int sum = 0;
        for (int q = 1; q <= limit; q++){
            sum += q;
        }
        System.out.println("Σ = " + sum);
        System.out.println("Average: " + sum / limit);
    }
}
