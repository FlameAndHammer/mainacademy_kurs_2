package _nikulin.labs.lab_2_7_1__2_7_5;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;
    public EthernetAdapter(String manufacturer, String serialNumber, float price, int speed, String mac) {
        super(manufacturer, serialNumber, price);
        this.speed = speed;
        this.mac = mac;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getMac() {
        return mac;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }

        // lab 2_7_2
    @Override
    public String toString() {
        return super.toString() + ", speed = " + speed + ", mac = " + mac;
    }

        // lab 2_7_3
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        EthernetAdapter divice = (EthernetAdapter) obj;
        if (speed != divice.getSpeed() )
            return false;
         return mac != divice.getMac();
    }

        // lab 2_7_4
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + mac.hashCode();
        return result;
    }
}
