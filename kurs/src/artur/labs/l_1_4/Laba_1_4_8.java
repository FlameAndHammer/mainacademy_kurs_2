package artur.labs.l_1_4;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Arthur on 04.03.2017.
 * Write a console program
 * that prints result type casting for different primitive types.
 */
public class Laba_1_4_8 {
    public static void main(String[] args) {
        int a = 2147483647;
        long b = a;
        System.out.println(" Long b = " + b);
        long c = 2147483648L;
        int d = (int) c ;
        System.out.println("int d = " +d); // don`t understand, why the result is with minus sigh?


    }

}
