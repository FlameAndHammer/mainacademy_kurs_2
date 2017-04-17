package _nikulin.labs.lab_2_7_1__2_7_5;

public class Device {
        // lab 2_7_1
    private String manufacturer,
                   serialNumber;
    private float price;
    public Device(String manufacturer, String serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

        // lab 2_7_2
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": manufacturer = " + manufacturer +
                ", price = " + price + ", serialNumber = " + serialNumber;
    }

        // lab 2_7_3
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Device device = (Device) obj;
        if (!manufacturer.equals(device.getManufacturer()) ||
                !serialNumber.equals(device.getSerialNumber()) ||
                price != device.getPrice())
            return false;
        return true;
    }

        // lab 2_7_4
    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + serialNumber.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        return result;
    }
}
