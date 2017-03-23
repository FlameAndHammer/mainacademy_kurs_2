package yuriy.labs.l_2_1;




public class Computer {
    private String manufacturer;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;
    private int serialNumber;

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



  public static void view(String[] args){
        for (int i = 0; i < 5; i++){
           // System.out.println(Computer);


        }



    }

    /*public static void main(String[] args) {
        Computer[] computerArray = new Computer[5];
        for (int i = 0; i < 5; i++){
            computerArray[i] = new Computer();
            computerArray[i].price += (i + 2);
            computerArray[i].price *= 0.1;

        }*/

    }




