package kirill.labs.l_1_4;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * Created by Storm on 01.03.2017.
 */
public class Labs143 {
    public static void main(String[] args) {
        System.out.println("Task: Write a console program that prints result of each of arithmetic logical (AND, OR, NOT,\n" +
                "XOR) for two variables of boolean data type.");

        boolean a = true;
        boolean b = false;

        System.out.println("Value boolean a = " + a);
        System.out.println("Value boolean b = " + b);

        boolean c = a & b;
        System.out.println("result operation a & b = " + c);

        boolean d = a | b;
        System.out.println("result operation a | b = " + d);

        boolean f = !a;
        System.out.println("result operation !a = " + f);

        boolean g = !b;
        System.out.println("result operation !b = " + g);

        boolean h = a ^ b;
        System.out.println("result operation a ^ b = " + h);

    }
}
