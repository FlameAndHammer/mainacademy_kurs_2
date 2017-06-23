package slavik.labs.l_2_7;


public class Main {
    public static void main(String[] args) {
        // lab 2_7_1
        Device base = new Device("Hp", "sx78605000", 33900);
        Monitor mon_1 = new Monitor("Hp", "gt634656", 2100, 1024, 860);
        EthernetAdapter ethernet_2 = new EthernetAdapter("Intel", "1000", 900, 3300, "00:1a:79:a8:d5:67");

        // lab 2_7_2
        System.out.println("This Base");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(base);
        System.out.println(mon_1);
        System.out.println(ethernet_2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println();

        // lab 2_7_3
        System.out.println("This Base №2");
        System.out.println("-----------------------------------------------------------------");
       Device base_2 = new Device("Hp", "sx78605000", 33900);
        System.out.println(base_2);
        System.out.println(mon_1);
        System.out.println(ethernet_2);
        System.out.println("-----------------------------------------------------------------");
        if (base.equals(base_2))
            System.out.println("Identical");
        else
            System.out.println("Not identical");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();

        // lab 2_7_4
        System.out.println("Hash Code " + base.getClass().getSimpleName() + ": " + base.hashCode());
        System.out.println("Hash Code " + base_2.getClass().getName() + ": " + base_2.hashCode());
        System.out.println("Hash Code " + mon_1.getClass().getTypeName() + ": " + mon_1.hashCode());
        System.out.println("Hash Code " + ethernet_2.getClass().getSimpleName() + ": " + ethernet_2.hashCode());
        System.out.println();

        // lab 2_7_5
        System.out.println("----------------------------------------------------------------");
        Device[] arrayDevice = new Device[10];
        for (int i = 0; i< arrayDevice.length; i=i+2) {
            arrayDevice[i] = new Device("ASUS", "A-76U01", 5050);
            arrayDevice[i+1] = new EthernetAdapter("Hp", "s9999", 5800, 1000, "001a.7432.4354");
        }
        for (Device object : arrayDevice)
            System.out.println(object);
    }
}
