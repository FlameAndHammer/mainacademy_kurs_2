package maksim.labs.l_1_4;

/**
 * Created by Пк on 05.03.2017.
 */
public class Lab1_4_6 {
    public static void main(String[] args) {
        int a = 0b0110_0111_1001_0110_1001_1010_1110_1010;
        int b = 0b0100_1001_0111_0101_1111_0100_1010_1111;
        System.out.println("decimal \"a\": " + a + ", decimal \"b\": " + b);
        System.out.println("\"a\"       " + (Integer.toString(a, 2)));
        System.out.println("\"b\"       " + (Integer.toString(b, 2)));
        System.out.println("          --------------------------------");
        System.out.println("\"a AND b\" " + (Integer.toString(a & b, 2)));
        System.out.println("\"a AND b\" decimal: " + (a & b));
        System.out.println();
        System.out.println("\"a\"       " + (Integer.toString(a, 2)));
        System.out.println("\"b\"       " + (Integer.toString(b, 2)));
        System.out.println("          --------------------------------");
        System.out.println("\"a OR b\"  " + (Integer.toString(a | b, 2)));
        System.out.println("\"a OR b\" decimal: " + (a | b));
        System.out.println();
        System.out.println("\"a\"       " + (Integer.toString(a, 2)));
        System.out.println("\"b\"       " + (Integer.toString(b, 2)));
        System.out.println("          --------------------------------");
        System.out.println("\"a XOR b\" " + (Integer.toString(a ^ b, 2)));
        System.out.println("\"a XOR b\" decimal: " + (a ^ b));
        System.out.println();
        System.out.println();
        System.out.println("\"a\"       " + (Integer.toString(a, 2)));
        System.out.println("\"NOT a\"  " + (Integer.toString(~a, 2)));
        System.out.println("\"NOT a\" decimal: " + (~a));
    }
}
