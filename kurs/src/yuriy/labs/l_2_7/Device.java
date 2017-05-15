package yuriy.labs.l_2_7;

/**
 * Created by Ruble on 11.04.2017.
 */
/*
Lab Work 2-7-1
        Create classes:
        1) Base class Device (manufacturer(String), price(float), serialNumber(String));
        2) Subclasses Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter(speed
        (int), mac (String));
        Add getters/setters and constructor to each class
-------------------------------------------------------------------------------------------------
Lab Work 2-7-2
        Override toString() method in each class.
        In toString() method provide code which prints class name and fields values.
        Example:
        Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD,
        X=1280,Y=1024
-------------------------------------------------------------------------------------------------
Lab Work 2-7-3
        Override equals() method in each class
--------------------------------------------------------------------------------------------------
Lab Work 2-7-4
        Override hashCode() method in each class
---------------------------------------------------------------------------------------------------
Lab Work 2-7-5
Create program (class Main). The program must demonstrate the creation of an arrays
of different types devices, setup and output characteristics of each device
*/

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }
    public String getManufacturer() { return manufacturer; }
    public float getPrice() { return price; }

    public String getSerialNumber() { return serialNumber; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public void setPrice(float price) { this.price = price; }

    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    @Override
    public String toString(){
        return Device.class.getSimpleName() + ": manufacturer = " + getManufacturer() + ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.getPrice(), getPrice()) != 0) return false;
        if (!getManufacturer().equals(device.getManufacturer())) return false;
        return getSerialNumber().equals(device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        int result = getManufacturer().hashCode();
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + getSerialNumber().hashCode();
        return result;
    }
    public static String generatorManufacturer() {
        String[] arrManufacturer = {"Samsung", "Dell", "Asus", "Lenovo", "Toshiba", "Sony", "Apple", "Acer", "Hewlett-Packard", "Fujitsu"};
        String manufacturer = arrManufacturer[(int)(Math.random() * 10)];
        return manufacturer;
    }

    public static float generatorPrice() {
        float price = (float) (Math.random () * 6000);
        return price;
    }

    public static String generatorSerialNumber() {
        String symbols = "qwerty12345";
        String serialNumber = "SN: ";
        int count = (int)(Math.random()*30);
        for(int i=0;i<count;i++)
            serialNumber = serialNumber + symbols.charAt((int)(Math.random()*symbols.length()));

        //System.out.println(serialNumber);
        return serialNumber;
    }
}
