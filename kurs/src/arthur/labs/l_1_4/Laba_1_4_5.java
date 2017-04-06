package arthur.labs.l_1_4;

/**
 * Created by Arthur on 04.03.2017.
 * Write a console program that prints result of bit shift operators for integer variable.
 */
public class Laba_1_4_5 {
    public static void main(String[] args) {
        int a=27 >> 3;
        System.out.println("bit shift 27 >> 3 = " +a);
        int b= 4 << 5;
        System.out.println("bit shift 4 << 5 = " +b);
        int c= -34 >> -3;
        System.out.println("bit shift -34 >> -3 = " +c);
        int d= 0 >> -4;
        System.out.println("bit shift 0 >> -4 = " +b);
        int e = 33 >>> 2;
        System.out.println("bit shift  3 >>> 4 = " +e);
            }
}
