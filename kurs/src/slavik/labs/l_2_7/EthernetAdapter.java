package slavik.labs.l_2_7;


public class EthernetAdapter extends Device{
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

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
            if (!super.equals(obj))return false;
            EthernetAdapter divice = (EthernetAdapter) obj;
            if (speed != divice.getSpeed() || mac != divice.getMac())return false;
            return true;
        }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 15 * result + speed;
        result = 15 * result + mac.hashCode();
        return result;
    }
}
