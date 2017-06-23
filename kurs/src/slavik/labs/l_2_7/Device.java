package slavik.labs.l_2_7;

public class Device {

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

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (!manufacturer.equals(device.getManufacturer()) || !serialNumber.equals(device.getSerialNumber()) ||
                price != device.getPrice()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 15 * result + serialNumber.hashCode();
        result = (int) (15 * result + price);
        return result;
    }
}
