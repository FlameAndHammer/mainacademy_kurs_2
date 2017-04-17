package olena.labs.L_2_7_1_to_2_7_5;

/**
 * Created by elenafostachuk on 4/17/17.
 */
public class MainDevices {
    public static void main(String[] args) {
        int[] devices = new int[2];
        Device someDevice = new Device();

        someDevice.setManufacturer(" Samsung ");
        someDevice.setSerialNumber(" AB1234567CD ");

        Monitor mon1 = new Monitor();
        mon1.setResolutionX(1280);
        mon1.setResolutionY(1024);

        EthernetAdaptor tpLink = new EthernetAdaptor();
        tpLink.setSpeed(1200);
        tpLink.setMac("XXXYYYZZZ123qsa23");

        System.out.println(devices.toString());
        System.out.println(mon1.toString());
        System.out.println(tpLink.toString());
    }
}



