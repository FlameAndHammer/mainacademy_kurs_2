package arthur.labs.l_2_1;

import java.util.Locale;

/**
 * Created by Arthur on 20.03.2017.
 * Write Computer class, the attributes of this class
 * is manufacturer (of String type), serialNumber (of int type),
 * price (of float type), quantityCPU (of int type)
 * and frequencyCPU (of int type).
 * The fields Computer class need to be encapsulated.
 * Add to Computer class getters and setters methods.
 * Use correct access modifiers.
 * _____________________________________
 * Write a program to create array of Computer objects (5 pcs.).
 * Declare array of Computer objects (5 pcs.),
 * create 5 Computer objects and place it to array (using loop).
 * ______________________________________________________________
 * Write a program that iterate through array of Computer objects
 * and increases by 10 percent field price.
 * ______________________________________________________________
 * Add to class Computer method void view(){} that prints all fields
 * of object in line. Print all info (fields) of all objects in console.
 * ____
 * 2 Classes : Main and Computers (contains method view) *
 */
public class Computer {

        private String manufacturer;
        private int serialNumber;
        private float price;
        private int quantityCPU;
        private int frequencyCPU;

        public String getManufacturer() {
                return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
        }

        public int getSerialNumber() {
                return serialNumber;
        }

        public void setSerialNumber(int serialNumber) {
                this.serialNumber = serialNumber;
        }

        public float getPrice() {
                return price;
        }

        public void setPrice(float price) {
                this.price = price;
        }

        public int getQuantityCPU() {
                return quantityCPU;
        }

        public void setQuantityCPU(int quantityCPU) {
                this.quantityCPU = quantityCPU;
        }

        public int getFrequencyCPU() {
                return frequencyCPU;
        }

        public void setFrequencyCPU(int frequencyCPU) {
                this.frequencyCPU = frequencyCPU;
        }

        public void view (){
                System.out.println(
                                " Manufacturer: " + getManufacturer() +
                                "\t | Serial Number: " + getSerialNumber() +
                                "\t | Price: " + String.format ( Locale.US, "%.2f", getPrice() )+
                                "\t | quantityCPU: " + getQuantityCPU() +
                                "\t | frequencyCPU: " +  getFrequencyCPU() );
        }
}
