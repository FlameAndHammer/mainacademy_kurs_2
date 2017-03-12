package maksim.labs.l_1_5;

import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_5_7_easy {
    public static void main(String[] args) {
        System.out.println("Enter the number till what we will find all perfect numbers.");
        System.out.print("Please not higher than 10000: ");
        Scanner sc = new Scanner(System.in);
        int endNumber = sc.nextInt();
        int div;
        int sum = 0;
        for (int m = 1; m <= endNumber; m++) {
            for (int x = 1; x < m; x++){
                div = m % x;
                if (div == 0){
                    sum += x;
                }
            }
            if (sum == m){
                System.out.println("I found the perfect number: " + sum);
            }
            sum = 0;
        }
    }
}





