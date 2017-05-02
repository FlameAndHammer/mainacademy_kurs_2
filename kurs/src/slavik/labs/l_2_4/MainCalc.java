package slavik.labs.l_2_4;

import java.util.Scanner;

public class MainCalc {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter : ");
            double p = MyCalc.calcPi(sc.nextInt());
            System.out.println("Pi = " + p);
        }
}
