package _nikulin.labs.lab_2_7_1__2_7_5;

public class Main {
    public static void main(String[] args) {
            // lab 2_7_1
	    Device baseClass = new Device("Lenovo", "QW-234", 3045);
        Monitor child_1 = new Monitor("ASUS", "MP-2U-6534", 6999, 1024, 860);
        EthernetAdapter child_2 = new EthernetAdapter("BBB", "U76", 5000, 500, "12-34-56");

            // lab 2_7_2
        System.out.println("----------------------------------------------------------------");
        System.out.println(baseClass);
        System.out.println(child_1);
        System.out.println(child_2);

            // lab 2_7_3
        System.out.println("----------------------------------------------------------------");
        Device baseClassOther = new Device("Lenovo", "QW-234", 1945.3f);
        if (baseClass.equals(baseClassOther))
            System.out.println("Equally!");
        else
            System.out.println("No equal!");

        Monitor childOther_1 = new Monitor("ASUS", "MP-2U-6534", 6999, 1024, 860);
//        Monitor childOther_1 = new Monitor("Dev", "MP-2U-6534", 9470.3f, 1024, 1024);
        if (child_1.equals(childOther_1))
            System.out.println("Equally!");
        else
            System.out.println("No equal!");

//        EthernetAdapter childOther_2 = new EthernetAdapter("Sony", "S12_U004", 9005.9f, 1000, "C5-58-DB");
        EthernetAdapter childOther_2 = new EthernetAdapter("Sony", "S12_U004", 9005.9f, 1200, "C5-58-DB");
        if (childOther_2.equals(child_2))
            System.out.println("Equally!");
        else
            System.out.println("No equal!");

            // lab 2_7_4System.out.println("----------------------------------------------------------------");
        System.out.println("Hash Code " + baseClass.getClass().getSimpleName() + ": " + baseClass.hashCode());
        System.out.println("Hash Code " + baseClassOther.getClass().getSimpleName() + ": " + baseClassOther.hashCode());
        System.out.println("Hash Code " + child_1.getClass().getSimpleName() + ": " + child_1.hashCode());
        System.out.println("Hash Code " + childOther_1.getClass().getSimpleName() + ": " + childOther_1.hashCode());
        System.out.println("Hash Code " + child_2.getClass().getSimpleName() + ": " + child_2.hashCode());
        System.out.println("Hash Code " + childOther_2.getClass().getSimpleName() + ": " + childOther_2.hashCode());

            // lab 2_7_5
        System.out.println("----------------------------------------------------------------");
        Device[] arrayDevice = new Device[6];
        for (int i = 0; i< arrayDevice.length; i=i+3) {
            arrayDevice[i] = new Device("ASUS", "A-76U01", 5050 + i);
            arrayDevice[i+1] = new Monitor("HP", "HP-6U-01", 6050 + i+1, 1024, 860);
            arrayDevice[i+2] = new EthernetAdapter("Lenovo","L12-56M", 1023.8f, 500, "35-A2-1C");
         }
        for (Device object : arrayDevice)
            System.out.println(object);
    }
}
