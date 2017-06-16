package yuriy.labs.labs_2.labs_2_10_.l_2_11.l_2_11_3;

import java.util.Scanner;

/**
 * Created by Ruble on 12.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_11_3 by Yuriy Denezhko:\n");
        System.out.print("Enter the age of the person -> ");
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        try {
        person.setAge(sc.nextInt());
        } catch (RuntimeException exp) {
            exp.printStackTrace();
        }
    }
}
