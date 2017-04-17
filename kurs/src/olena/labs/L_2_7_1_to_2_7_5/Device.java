package olena.labs.L_2_7_1_to_2_7_5;

/**
 * Created by elenafostachuk on 4/17/17.
 */
public class Device {//* lines 6  to 65 = L_2_7_1
    private static String manufacturer;
    private static String serialNumber;

    public static String getManufacturer() {
        return manufacturer;
    }

    public static void setManufacturer(String manufacturer) {
        Device.manufacturer = "Samsung";
    }

    public static String getSerialNumber() {
        return serialNumber;
    }

    public static void setSerialNumber(String serialNumber) {
        Device.serialNumber = "AB1234567CD";
    }
    public Device(){//* L_2_7_2
    }
    public String toString(){
        return Device.class.getName() + " :" +  getManufacturer() + " :"  + getSerialNumber() ;
    }

}
class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = 1280;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = 1024;
    }


    public Monitor() {//* L 2_7_2
    }

    public String toString() {
        return Monitor.class.getName()+ "! " + "serial number: "  + " " + getSerialNumber() + ", " + "manufacturer: " +  Monitor.getManufacturer()+ ", " +" resolution: " + getResolutionX() +" x " + getResolutionY();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    } //* L2_7_3 to 2_7_4

    public int hashcode() {
        return super.hashCode();
    }
}

class EthernetAdaptor extends Device {
    private int speed;
    private String mac;

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
    public EthernetAdaptor(){//* L_2_7_2
    }
    public String toString(){
        return EthernetAdaptor.class.getName() +"! " + " manufacturer: "  + getManufacturer() + "," +" serial number: " + getSerialNumber() + "," + " mac adress: " + getMac() + ","   + "  average speed: " + getSpeed();
    }
    public boolean equals(Object obj){ return super.equals(obj);}
    public int hashcode() {return  super.hashCode();}
}
