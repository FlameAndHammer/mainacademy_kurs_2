package slavik.labs.l_2_4;

public class MyCalc {
    public static double calcPi(int n) {
        int p = 4;
        double pi = 0;
        double delPi = 1;
        for (int i = 1; i <=n; i++, delPi += 2) {
            if (i % 2 == 0)
                pi += - p /delPi;
            else
                pi +=  p /delPi;
        }
                return pi;
        }
    }