package kirill.labs.l_1_4;

/**
 * Created by Storm on 01.03.2017.
 */
public class Labs144 {
    public static void main(String[] args) {
        System.out.println("Result of increment and decrement in prefix and\n" +
                "postfix mode for integer variable");
        int a, b, c, d, e, f;
        a = 5;
        b = 8;
        System.out.println("a= " + a +'\n' + "b= "+b);

        System.out.println("Incrment");
        c = ++a;
        d = b++;
        System.out.println("c = ++a = " + c +'\n' + "d = b++ = " + d);
        System.out.println("a = " + a + '\n' + "b = " + b);

        System.out.println("Dencrment");
        e = --a;
        f = b--;
        System.out.println("e = --a = " + e +'\n' + "f = b-- = " + f);
        System.out.println("a = " + a + '\n' + "b = " + b);

    }
}
