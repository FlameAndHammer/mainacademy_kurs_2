package maksim.labs.l_2_7;

/**
 * Created by Пк on 13.04.2017.
 */
public class Device {
    private static String manufacturer,
                          serialNumber;
    private static float price;

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Device.manufacturer = manufacturer;
    }

    public static String getSerialNumber() {
        return serialNumber;
    }

    public static void setSerialNumber(String serialNumber) {
        Device.serialNumber = serialNumber;
    }

    public static float getPrice() {
        return price;
    }

    public static void setPrice(float price) {
        Device.price = price;
    }

    public Device() {
    }

    @Override
    public String toString() {
        System.out.println(Device.class.getSimpleName() + ": manufacturer = " + getManufacturer() + "; price = "
        + getPrice() + "; serial number = " + getSerialNumber());
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

    class Monitor extends Device {
    private static int resolutionX,
                       resolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public Monitor() {
    }

        @Override
        public String toString() {
            System.out.println(Monitor.class.getSimpleName() + ": manufacturer = " + getManufacturer() + "; price = "
                    + getPrice() + "; serial number = " + getSerialNumber() + "; X= " + getResolutionX()
            + "; Y = " + getResolutionY());
            return super.toString();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }

    class EthernetAdapter extends Device{
        private static int speed;
        private static String mac;

        public static int getSpeed() {
            return speed;
        }

        public static void setSpeed(int speed) {
            EthernetAdapter.speed = speed;
        }

        public static String getMac() {
            return mac;
        }

        public static void setMac(String mac) {
            EthernetAdapter.mac = mac;
        }

        public EthernetAdapter() {
        }

        @Override
        public String toString() {
            System.out.println(EthernetAdapter.class.getSimpleName() + ": manufacturer = " + getManufacturer() + "; price = "
                    + getPrice() + "; serial number = " + getSerialNumber() + "; speed = " + getSpeed()
            + "; mac address = " + getMac());
            return super.toString();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }
