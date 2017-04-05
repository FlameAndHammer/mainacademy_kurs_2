package slavik.labs.l_2_1;
public class Computer {
    private String manufacturer = null;
    private int serialNumber = 0;
    private float price = 0f;
    private int quantityCPU = 0;
    private int frequencyCPU = 0;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }
    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantityCPU() {
        return quantityCPU;
    }
    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    void view() {
        System.out.print("Manufacturer: " + manufacturer);
        System.out.print(" SerialNumber: " + serialNumber);
        System.out.print(" Price: " + price);
        System.out.print(" QuantityCPU: " + quantityCPU);
        System.out.println(" FrequencyCPU: " + frequencyCPU);
    }
}