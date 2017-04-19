package arthur.labs.l_2_7_a;

/**
 * Created by arthk on 18.04.2017.
 * Create program (class Main). The program must demonstrate the creation of an arrays
 * of different types devices, setup and output characteristics of each device
 */
public class Main {
    public static void main(String[] args) {
        Device array[] = new Device [4];
        array[0] = new Device ("Elektronika", 450.65f, "El-156"  );
        array[1] = new Monitor ("Lg", 550.65f, "Lg-156", 1920, 1280  );
        array[2] = new EthernetAdapter ("GigaByte", 350.65f, "Gb-156", 1000, "AS-09_DF_65");
        array[3] = new EthernetAdapter ("GigaByte", 350.65f, "Gb-156", 1000, "AS-09_DF_65");

        for (Device cell :array) System.out.println(cell);
        System.out.println(array[2].equals(array[1]));
        System.out.println(array[2].equals(array[3]));
        for (Device cell :array) System.out.println(cell.hashCode());
    }
}
