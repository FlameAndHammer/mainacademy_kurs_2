package slavik.labs.l_2_7;


public class Monitor extends Device {
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

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Monitor divice = (Monitor) obj;
        if (resolutionX != divice.getResolutionX() || resolutionY != divice.getResolutionY())return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 15 * result + resolutionX;
        result = 15 * result + resolutionY;
        return result;
    }
}
