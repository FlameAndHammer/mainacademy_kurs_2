package arthur.labs.l_2_10;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by arthk on 21.05.2017.
 * Create new project called WrapperDemo. Add package “com.brainacad.oop.testwrapper”.
 * Create class Main with method main(). In main() method declare few xN local variable of Integer class
 * and initialize it with same value (lower then 128), but in different manner. For example: Integer x1 = 10;
 * Integer x2 = new Integer(10); Integer x4 = Integer.valueOf(10); Integer x5 = Integer.parseInt(“10”);
 * Compare it to each other using “==” and equals(), print result to console. Do the same, but for value higher than 128.
 */
public class L_2_10_1 {
    public static void main(String[] args) {
        Integer x1 = 12;
        Integer x2 = new Integer(12);
        Integer x3 = Integer.valueOf(12);
        Integer x4 = Integer.parseInt("12");

        System.out.println("x1 == x2: " + (x1 == x2));
        System.out.println("x1 equals x2: " + (x1.equals(x2)));
        System.out.println("x1 == x3: " + (x1 == x3));
        System.out.println("x1 equals x3: " + (x1.equals(x3)));
        System.out.println("x1 == x4: " + (x1 == x4));
        System.out.println("x1 equals x4: " + (x1.equals(x4)));

        System.out.println("x2 == x3: " + (x2 == x3));
        System.out.println("x2 equals x3: " + (x2.equals(x3)));
        System.out.println("x2 == x4: " + (x2 == x4));
        System.out.println("x2 equals x4: " + (x2.equals(x4)));

        System.out.println("x3 == x4: " + (x3 == x4));
        System.out.println("x3 equals x4: " + (x3.equals(x4)));

        System.out.println();

        Integer x11 = 129;
        Integer x21 = new Integer(129);
        Integer x31 = Integer.valueOf(129);
        Integer x41 = Integer.parseInt("129");

        System.out.println("x11 == x21: " + (x11 == x21));
        System.out.println("x11 equals x21: " + (x11.equals(x21)));
        System.out.println("x11 == x31: " + (x11 == x31));
        System.out.println("x11 equals x31: " + (x11.equals(x31)));
        System.out.println("x11 == x41: " + (x11 == x41));
        System.out.println("x11 equals x41: " + (x11.equals(x41)));

        System.out.println("x21 == x31: " + (x21 == x31));
        System.out.println("x21 equals x31: " + (x21.equals(x31)));
        System.out.println("x21 == x41: " + (x21 == x41));
        System.out.println("x21 equals x41: " + (x21.equals(x41)));

        System.out.println("x31 == x41: " + (x31 == x41));
        System.out.println("x31 equals x41: " + (x31.equals(x41)));

    }
}
