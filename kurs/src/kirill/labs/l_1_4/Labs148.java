package kirill.labs.l_1_4;

/**
 * Created by Storm on 01.03.2017.
 */
public class Labs148 {
    public static void main(String[] args) {
        System.out.println("Task: Write a console program that prints result type casting for different primitive types.");
        long bigVAl = 99L;
        System.out.println(bigVAl);

        int x1 = (int) bigVAl;
        System.out.println(x1);

        int x2 = (int)99L;
        System.out.println(x2);

        float x3 = (float) x2;
        System.out.println(x3);

        double x4 = (double) x3;
        System.out.println(x4);

        double x5 = 3.92345113243234;
        int x6 = (int) x5;
        System.out.println(x6);

        float x7 = (float) x5;
        System.out.println(x7);

    }
}
