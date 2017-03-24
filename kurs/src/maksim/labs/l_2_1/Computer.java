package maksim.labs.l_2_1;


/**
 * Created by Пк on 20.03.2017.
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

    public float setPrice(float price) {
        this.price = price;
        return price;
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

    public void view(){
        Computer[] comp = new Computer[5];
        String[] manufacturer = {"Asus", "hp", "Acer", "Dell", "Lenovo"};
        for (int i = 0; i < comp.length; i++){
            comp[i] = new Computer();
            comp[i].setPrice(9000 + (float)(Math.random() * 10000));
            float compPrice = comp[i].getPrice();
            System.out.println();
            System.out.println("Old price of computer #" + (i + 1) + ": " + compPrice + "UAH");
            comp[i].setPrice((float)(compPrice + (compPrice * 0.1)));
            System.out.println("New price of computer #" + (i + 1) + ": " + comp[i].getPrice() + "UAH");
            System.out.println();
            comp[i].setManufacturer(manufacturer[(int)(Math.random() * i)]);
            comp[i].setSerialNumber(100 + (int)(Math.random() * 999));
            comp[i].setQuantityCPU(1 + (int)(Math.random() * 4));
            comp[i].setFrequencyCPU(200 + (int)(Math.random() * 100));
            System.out.println("Computer " + (i + 1) + " options:");
            System.out.print("Manufacturer: " + comp[i].getManufacturer() + "; serial #: " + comp[i].getSerialNumber() +
                    "/AC; CPU quantity: " + comp[i].getQuantityCPU() + "; CPU frequency: " + comp[i].getFrequencyCPU() + "Mhz; price: " +
                    comp[i].getPrice() + " UAH");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Computer newComp = new Computer();
        newComp.view();
    }


}

