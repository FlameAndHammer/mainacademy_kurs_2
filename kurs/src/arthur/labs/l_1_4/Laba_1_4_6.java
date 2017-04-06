package arthur.labs.l_1_4;

/**
 * Created by Arthur on 04.03.2017.
 * Write a console program
 * that prints result of Bitwise operators for two integer variables.
 */
public class Laba_1_4_6 {
    public static void main(String[] args) {
        int a = 13;
        int b = 24;
        System.out.println("13 and 24 = " + (a & b) );
        System.out.println("13 or 24 = " + (a | b) );
        System.out.println("13 xor 24 = " + (a ^ b) );
        System.out.println("not 13 = " + (~a) );
    }
}
