package _nikulin.labs.lab_2_4_7;

public class GravityCalculator {
    private final static double ACCELERATION; // = -9.81;
    private double v = 0.0,
                   x = 1000.0;
    static {
        ACCELERATION = -9.81;
    }
    public double calcDist(double time) {
         return 0.5 * ACCELERATION * Math.pow(time, 2) + v * time + x;
    }
}
