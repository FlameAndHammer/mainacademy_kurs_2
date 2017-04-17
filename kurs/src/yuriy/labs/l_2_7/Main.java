package yuriy.labs.l_2_7;

import java.util.Scanner;

/**
 * Created by Ruble on 14.04.2017.
 */
/*
Lab Work 2-7-5
        Create program (class Main). The program must demonstrate the creation of an arrays
        of different types devices, setup and output characteristics of each device
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_7_1 - 5 by Yuriy Denezhko:");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of  -> array");
        int lengthOfArray = scanner.nextInt();
        Device [] deviceArr = new Device[lengthOfArray];
        Monitor [] monitorArr = new Monitor[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++){
           deviceArr[i].setManufacturer(deviceArr[i].generatorManufacturer());
           deviceArr[i].setPrice(deviceArr[i].generatorPrice());
           //deviceArr[i].setSerialNumber(1);
        }
    }
}
