package dana.labs.l_2_1;

/**
 * Created by Dana on 20.03.2017.
 */
public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer(){
        return manufacturer;
    };

    //alt+insert

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    void view(){
    System.out.println("Computer is:"+"Manufacturer "+manufacturer+" serialNumber "+serialNumber
            +" price "+price+" quantityCPU "+quantityCPU+" frequencyCPU "+frequencyCPU);
}
}