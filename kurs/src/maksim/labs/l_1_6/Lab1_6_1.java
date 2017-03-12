package maksim.labs.l_1_6;

import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_6_1 {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int ar[] = new int[end/2];
        System.out.println("Array consisting of only even numbers from 1 to " + end);
        for (int i = 0; i < end / 2; i++) {
            ar[i] = 2 * i + 2;
            System.out.print(ar[i] + " ");
        }
    }
}
