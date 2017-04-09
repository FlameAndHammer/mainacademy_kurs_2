package irina.labs.L_1_3;

/**
 * Created by epub on 3/20/2017.
 */
public class Computer {
    //private static void main(String[] args) {
        private String manufacturer = "IBM";
        private int SerialNumber = 1;
        private float price = 100.345F;
        private int quantityCPU = 2;
        private int frequencyCPU = 100;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
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
}
