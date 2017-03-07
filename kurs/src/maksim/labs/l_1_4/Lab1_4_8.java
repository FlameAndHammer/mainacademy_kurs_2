package maksim.labs.l_1_4;

/**
 * Created by Пк on 05.03.2017.
 */
public class Lab1_4_8 {
    public static void main(String[] args) {
        byte b = 113;
        short s = b;
        int i = b;
        long l = b;
        float f = b;
        double d2 = b;
        System.out.println("primitives casting");
        System.out.println("byte " + b + " -> short " + s + " -> int " + i + " -> long " + l + " -> float " + f + " -> double " + d2);
        char c = '\u0043';
        int i2 = c;
        System.out.println("char " + c + " -> int " + i2);
        long l2 = 112L;
        int i3 = (int) l2;
        short s2 = (short) l2;
        byte b2 = (byte) l2;
        System.out.println("long " + l2 + " -> int " + i3 + " -> short " + s2 + " -> byte " + b2);
        System.out.println("\ndowngrading of a big number will cause misunderstood results");
        long l3 = 119048738572977592L;
        int i4 = (int) l3;
        short s3 = (short) l3;
        byte b3 = (byte) l3;
        System.out.println("long " + l3 + " -> int " + i4 + " -> short " + s3 + " -> byte " + b3);
    }
}
