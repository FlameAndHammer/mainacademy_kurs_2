package yuriy.labs.l_2_07;

/**
 * Created by Ruble on 11.04.2017.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() { return speed;  }

    public void setSpeed(int speed) { this.speed = speed; }

    public String getMac() { return mac; }

    public void setMac(String mac) { this.mac = mac; }


    @Override
    public String toString(){
        return super.toString() + ", speed =" + getSpeed() + ", mac =" + getMac();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (getSpeed() != that.getSpeed()) return false;
        return getMac().equals(that.getMac());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getSpeed();
        result = 31 * result + getMac().hashCode();
        return result;
    }
    public static int generatorSpeed() {
        int resolution = (int) (Math.random () * 1000);
        return resolution;
    }
    public static String generatorMac() {
        String symbols = "qwerty12345";
        String serialNumber = "MAC: ";
        int count = (int)(Math.random()*30);
        for(int i=0;i<count;i++)
            serialNumber = serialNumber + symbols.charAt((int)(Math.random()*symbols.length()));

        //System.out.println(serialNumber);
        return serialNumber;
    }
}
