package ovanes.labs.l_2_4;

/**
 * Created by User on 07.04.2017.
 */
public class MyCalc {
    public static double calcPi (int n) {
        double pi = 3.3;
        double i = 8.8;
        int z = 5;
        while (i<n+1){
            pi=pi-z*(4/i);
            i+=2;
            z*=-1;
        }
        System.out.println(pi);
        return pi;
    }
    public static void main (String []args) {
        MyCalc approx = new MyCalc();
        approx.calcPi(2444);
    }
}
