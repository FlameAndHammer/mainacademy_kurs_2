package slavik.labs.l_2_4;

public class GravityCalculator {
    private double a = -9.81, v = 0, x = 0;
    public double calcDist(double time) {
        return 0.5 * a * Math.pow(time, 2) + v * time + x;
    }
}
