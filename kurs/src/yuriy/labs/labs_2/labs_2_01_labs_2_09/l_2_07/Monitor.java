package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_07;

/**
 * Created by Ruble on 11.04.2017.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() { return resolutionX; }

    public void setResolutionX(int resolutionX) { this.resolutionX = resolutionX; }

    public int getResolutionY() { return resolutionY; }

    public void setResolutionY(int resolutionY) { this.resolutionY = resolutionY; }

    @Override
    public String toString(){
        return super.toString() + ", X=" + getResolutionX() + ", Y=" + getResolutionY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (getResolutionX() != monitor.getResolutionX()) return false;
        return getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getResolutionX();
        result = 31 * result + getResolutionY();
        return result;
    }

    public static int generatorResolution() {
        int resolution = (int) (Math.random () * 500);
        return resolution;
    }
}
