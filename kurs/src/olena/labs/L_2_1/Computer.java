package olena.labs.L_2_1;

/**
 * Created by elenafostachuk on 3/20/17.
 */

public class Computer {
    private int counter;
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public void setCounter(int counter) {this.counter = counter;}
    public int getCounter() {return counter;}

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getManufacturer() {return manufacturer;}

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

    void view() {
        System.out.println("comp" + counter);
        System.out.println("Manufacturer" + " " + getManufacturer());
        System.out.println("Serial number" + " " + serialNumber);
        System.out.println("Price" +  " " + price);
        System.out.println("Quantity of the CPU" +" " + quantityCPU);
        System.out.println("Frequency of the CPU" +" " + frequencyCPU);
    }

}











