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
    String manufacturer;
    float price;
    String serialNumber;

    public String getManufacturer() { return manufacturer; }

    public String generatorManufacturer() {
        String[] arrManufacturer = {"Samsung", "Dell", "Asus", "Lenovo", "Toshiba", "Sony", "Apple", "Acer", "Hewlett-Packard", "Fujitsu"};
        manufacturer = arrManufacturer[(int)(Math.random() * 10)];
        return manufacturer;
    }


    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public float getPrice() { return price; }

    public float generatorPrice() {
        price = (float) (Math.random () * 6000);
        return price;
    }


    public void setPrice(float price) { this.price = price; }

    public String getSerialNumber() { return serialNumber; }

    public String generatorSerialNumber() {
       // serialNumber = (String) (Math.random () * 100000);
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }
    @Override
    public String toString(){
        return Device.class.getSimpleName() + ": manufacturer =" + getManufacturer() + ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }

}
class Monitor extends Device {
    int resolutionX;
    int resolutionY;
    void EthernetAdapter(int speed, String mac ){}

    public int getResolutionX() { return resolutionX; }

    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX; }

    public int getResolutionY() { return resolutionY; }

    public void setResolutionY(int resolutionY) { this.resolutionY = resolutionY; }

    @Override
    public String toString(){
        return Monitor.class.getSimpleName() + ": manufacturer =" + getManufacturer() + ", price=" + getPrice() +
                ", serialNumber=" + getSerialNumber() + ", X=" + getResolutionX() + ", Y=" + getResolutionY();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}