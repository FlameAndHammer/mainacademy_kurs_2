package maksim.labs.l_1_2;

import java.util.Scanner;

/**
 * Created by Пк on 27.02.2017.
 */
public class Lab1_2_2 {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner name = new Scanner(System.in);
        String yourname = name.nextLine();
        System.out.print("Hello, ");
        System.out.println(yourname);
    }
}
