package vladimir.labs.l_2_1;

/**
 * Created by Admin on 20.03.2017.
 */
public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequenceCPU;

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber (int serialNumber){
        this.serialNumber = serialNumber;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public int getQuantityCPU() {
        return quantityCPU;
    }
    public void setQuantityCPU (int quantityCPU){
        this.quantityCPU = quantityCPU;
    }
    public int getFrequenceCPU() {
        return frequenceCPU;
    }
    public void setFrequenceCPU (int frequenceCPU){
        this.frequenceCPU = frequenceCPU;
    }

    void view (){
        System.out.println("Manufacturer - " + manufacturer);
        System.out.println("Serial Number - " + serialNumber);
        System.out.println("Price - " + price);
        System.out.println("Quantity - " + quantityCPU);
        System.out.println("CPU frequency - " + frequenceCPU);
    }
}
