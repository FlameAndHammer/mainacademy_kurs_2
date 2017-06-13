package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_01;

/**
 * Created by Ruble on 20.03.2017.
 */
/*

1 Write Computer class, the attributes of this class is manufacturer (of String type),
        serialNumber (of int type), price (of float type), quantityCPU (of int type)
        and frequencyCPU (of int type).
2 The fields Computer class need to be encapsulated.
Add to Computer class getters and setters methods. Use correct access modifiers.

3 Write a program to create array of Computer objects (5 pcs.).
Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to
array (using loop).

4 Write a program that iterate through array of Computer objects and increases by 10
percent field price.

5 Add to class Computer method void view(){} that prints all fields of object in line.
Print all info (fields) of all objects in console.

*/



public class Computer {
    private String manufacturer;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;
    private int serialNumber;

    public String getManufacturer() {
        String[] arrManufacturer = {"Samsung", "Dell", "Asus", "Lenovo", "Toshiba", "Sony", "Apple", "Acer", "Hewlett-Packard", "Fujitsu"};
        manufacturer = arrManufacturer[(int)(Math.random() * 10)];
        return manufacturer;
    }

    public int getSerialNumber() {
        serialNumber = (int) (Math.random () * 100000);
        return serialNumber;
    }

    public float getPrice() {
        price = (float) (Math.random () * 5000);
        return price;
    }
    public int getQuantityCPU() {
        quantityCPU = (int) (1 + Math.random () * 4);
        return quantityCPU;
    }

    public int getFrequencyCPU() {
        frequencyCPU = (int)(100 + Math.random() * 7000);
        return frequencyCPU;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price += (this.price *= 0.1);
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

 /* public static void view(String[] args){
        for (int i = 0; i < 5; i++){
           // System.out.println(Computer);
        }
    }
*/
    public static void main(String[] args) {
        System.out.println("LabWork 2 (Computer) by Yuriy Denezhko:");
        System.out.println();


        Computer[] computerArray = new Computer[5];
        for (int i = 0; i < 5; i++){
            computerArray[i] = new Computer();
            computerArray[i].getManufacturer();
            computerArray[i].getFrequencyCPU();
            computerArray[i].getQuantityCPU();
            computerArray[i].getSerialNumber();
            computerArray[i].getPrice();

            System.out.println("Computer " + (i + 1) + " options:");
            System.out.println("Manufacturer: " + computerArray[i].manufacturer + ";");
            System.out.println("CPU quantity: " + computerArray[i].quantityCPU + " core;");
            System.out.println("CPU frequency: " + computerArray[i].frequencyCPU + " Ghz;");
            System.out.println("Serial Number: " + computerArray[i].serialNumber + ";");
            System.out.print("Price: " + computerArray[i].price + " $,");
            computerArray[i].setPrice(computerArray[i].price);
            System.out.println("\t New price: " + computerArray[i].price + " $.");
            System.out.println();

        }

    }
}




