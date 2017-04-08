package irina.labs.L_2_1;

public class Computer {
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;
    private String manufacturer;

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

   public static void main(String[] args) {  // can`t name method as public void view() - why?
            Computer MyComputer[] = new Computer[5];
            String[] manufacturer = {"Samsung", "Apple", "Dell", "HP", "Lenovo"};
            for (int j = 0; j < MyComputer.length; j++) {
                MyComputer[j] = new Computer();
                MyComputer[j].setPrice(100 + (float) (Math.random() * 250));
                float compPrice = MyComputer[j].getPrice();
                System.out.println( "\n" + "Old price of computer #" + (j + 1) + ": " + compPrice + "UAH");
                MyComputer[j].setPrice((float) (compPrice + (compPrice * 0.1)));
                System.out.println("New price of computer #" + (j + 1) + ": " + MyComputer[j].getPrice() + "UAH" + "\n");
                MyComputer[j].setManufacturer(manufacturer[(int)(Math.random() * j)]);
                MyComputer[j].setSerialNumber(100 + (int)(Math.random() * 260));
                MyComputer[j].setQuantityCPU(1 + (int)(Math.random() * 270));
                MyComputer[j].setFrequencyCPU(200 + (int)(Math.random() * 280));
                System.out.println("Computer " + (j + 1) + " specification:");
                System.out.print("Manufacturer: " + MyComputer[j].getManufacturer() + "; serial #: " + MyComputer[j].getSerialNumber() +
                        "; CPU quantity: " + MyComputer[j].getQuantityCPU() + "; CPU frequency: " + MyComputer[j].getFrequencyCPU() + " Mhz; price: " +
                        MyComputer[j].getPrice() + " UAH");
                System.out.println();

            }
        }
    }