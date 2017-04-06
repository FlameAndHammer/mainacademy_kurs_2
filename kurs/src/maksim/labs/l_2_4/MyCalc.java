package maksim.labs.l_2_4;

/**
 * Created by Пк on 05.04.2017.
 */
public class MyCalc {
    public static double calcPi(int n) {
        double pi = 4.0;
        double i = 3;
        int k = 1;
        while (i < n + 1) {
            pi = pi - k * (4 / i);
            i += 2;
            k *= -1;
        }
        System.out.println(pi);
        return pi;
    }

    public static void main(String[] args) {
        MyCalc approx = new MyCalc();
        approx.calcPi(1111111111);
    }
}