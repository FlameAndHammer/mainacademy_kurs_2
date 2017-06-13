package yuriy.labs.l_2_07;

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
        System.out.print("Enter the value of devices of different types -> ");
        int lengthOfArray = scanner.nextInt() * 3  ;
        Device [] deviceArr = new Device[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i = i + 3){
           deviceArr[i] = new Device(Device.generatorManufacturer(),Device.generatorPrice(),Device.generatorSerialNumber());

          deviceArr[i + 1] = new Monitor(Device.generatorManufacturer(),
                   Device.generatorPrice(),
                   Device.generatorSerialNumber(),
                   Monitor.generatorResolution(),
                   Monitor.generatorResolution());

          deviceArr[i + 2] = new EthernetAdapter(Device.generatorManufacturer(),
                   Device.generatorPrice(),
                   Device.generatorSerialNumber(),
                   EthernetAdapter.generatorSpeed(),
                   EthernetAdapter.generatorMac());
        }
        for (Device object : deviceArr)
            System.out.println(object);



        for (int i = 0; i < lengthOfArray; i =  i + 3){
            System.out.println(deviceArr[i]);
        }
    }
}
