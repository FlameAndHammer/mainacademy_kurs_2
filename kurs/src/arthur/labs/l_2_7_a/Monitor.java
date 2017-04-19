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

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor (String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY){
        super(manufacturer, price,serialNumber );
       this.resolutionX = resolutionX;
       this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() + "Monitor{" +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }

    public int getResolutionX() { return resolutionX;}
    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX;}
    public int getResolutionY() { return resolutionY;}
    public void setResolutionY(int resolutionY) {this.resolutionY = resolutionY;}
}
