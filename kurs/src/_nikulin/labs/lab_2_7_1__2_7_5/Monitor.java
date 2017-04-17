package _nikulin.labs.lab_2_7_1__2_7_5;

public class Monitor extends Device {
        // lab 2_7_1
    private int resolutionX,
                resolutionY;
    public Monitor(String manufacturer, String serialNumber, float price, int resolutionX, int resolutionY) {
        super(manufacturer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }
    public int getResolutionX() {
        return resolutionX;
    }
    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }
    public int getResolutionY() {
        return resolutionY;
    }
    public void setResolutionY(int getResolutionY) {
        this.resolutionY = getResolutionY;
    }

        // lab 2_7_2
    @Override
    public String toString() {
        return super.toString() + ", X = " + resolutionX + ", Y = " + resolutionY;
    }

        // lab 2_7_3
    @Override
    public boolean equals(Object obj) {
        if ( !super.equals(obj))
            return false;
        Monitor divice = (Monitor) obj;
        if (resolutionX != divice.getResolutionX() ||
                resolutionY != divice.getResolutionY())
            return  false;
        return true;
    }

        // lab 2_7_4
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
