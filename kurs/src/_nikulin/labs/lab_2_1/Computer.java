package _nikulin.labs.lab_2_1;

public class Computer {
        // lab 2_1_1
    private String manufacturer;
    private int serialNumber;
    private double price;
    private int  quantityCPU;
    private int frequencyCPU;

        // lab 2_1_2
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
    public void setQuantityCPU(int quantityCPU) {this.quantityCPU = quantityCPU;}
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

        // lab 2_1_5
    void view() {
        System.out.print("Manufacturer: " + manufacturer);
        System.out.print("; SerialNumber: " + serialNumber);
        System.out.print("; Price: " + price);
        System.out.println("; FrequencyCPU: " + frequencyCPU);
    }


}
