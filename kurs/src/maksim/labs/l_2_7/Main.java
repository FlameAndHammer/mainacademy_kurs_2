package maksim.labs.l_2_7;

import java.util.Scanner;

/**
 * Created by Пк on 13.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("How many devices?");
        Scanner scanner = new Scanner(System.in);
        int[] quantityOfDevices = new int[scanner.nextInt()];
        for (int i = 0; i < quantityOfDevices.length; i++) {
            Device someDevice = new Device();
            someDevice.setManufacturer("Famous manufacturer with apple on the logo");
            someDevice.setPrice((float)(7000 + (Math.random() * 3000)));
            someDevice.setSerialNumber("FM-MacPRO/" + (int)(100000 + (Math.random() * 899999)));
            Monitor bigMonitor = new Monitor();

            bigMonitor.setResolutionX((int)(12.8 + (Math.random() * 6.7)) * 160);
            bigMonitor.setResolutionY((bigMonitor.getResolutionX() / 16) * 9);
            EthernetAdapter internetAdapter = new EthernetAdapter();
            internetAdapter.setSpeed((int)(10 + (Math.random() * 9)) * 10);
            internetAdapter.setMac("HJK7:976F:FHY7:" + ((int)(5000 + (Math.random() * 4999))));
            someDevice.toString();
            bigMonitor.toString();
            internetAdapter.toString();
        }
    }
}