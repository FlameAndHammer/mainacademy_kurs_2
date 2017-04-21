package arthur.labs.l_2_7_a;

/**
 * Created by arthk on 18.04.2017.
 * Create classes:
 1)	Base class Device (manufacturer(String), price(float), serialNumber(String));
 2)	Subclasses Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter(speed (int), mac (String));
 Add getters/setters and constructor to each class
 Override toString() method in each class.
 In toString() method provide code which prints class name and fields values.
 Example:
 Device: manufacturer = Samsung, price=120, serialNumber=AB1234567CD
 Monitor: manufacturer = Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
 Override equals() method in each class
 Override hashCode() method in each class
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac){
        super(manufacturer, price,serialNumber );
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() + "EthernetAdapter{" +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        if (speed != that.speed) return false;
        return mac != null ? mac.equals(that.mac) : that.mac == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public String getMac() {return mac;}
    public void setMac(String mac) { this.mac = mac;}
}
