package _nikulin.labs.lab_2_4_5;

public class MyCalc {
    public static double caicPi(int count) {
        double pi = 0;
        final int valueFour = 4;
        double divider = 1.0;
        for (int i=1; i<=count; i++, divider += 2) {
            if (i%2 == 0)
                pi += -valueFour/divider;
            else
                pi += valueFour/divider;
        }
        return pi;
    }
}
