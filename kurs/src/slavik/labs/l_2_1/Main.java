package slavik.labs.l_2_1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner param = new Scanner(System.in);
        Computer[] array = new Computer[5];
        int count = 1;
        for (int i = 0; i < 5; i++) {
            array[i] = new Computer();
            System.out.println("Enter Manufacturer: ");
            String manufacturer = param.next();
            array[i].setManufacturer(manufacturer);
            System.out.println("Enter SerialNumber: ");
            int serial = param.nextInt();
            array[i].setSerialNumber(serial);
            System.out.println("Enter price: ");
            float price = param.nextInt();
            array[i].setPrice(price);
            System.out.println("Enter quantityCPU: ");
            int quantityCPU = param.nextInt();
            array[i].setQuantityCPU(quantityCPU);
            System.out.println("Enter frequencyCPU: ");
            int frequencyCPU = param.nextInt();
            array[i].setFrequencyCPU(frequencyCPU);
        }
        for (Computer obj :array){
            System.out.print(" Manufacturer: " + obj.getManufacturer());
            System.out.print(" SerialNumber: " + obj.getSerialNumber());
            System.out.print(" Price: " + obj.getPrice());
            System.out.print(" QuantityCPU: " + obj.getQuantityCPU());
            System.out.println(" FrequencyCPU: " + obj.getFrequencyCPU());
            System.out.println();
        }
        for (Computer obj:array) {
            System.out.println("Computer №"+count);
            obj.view();
            count++;
        }
    }
}