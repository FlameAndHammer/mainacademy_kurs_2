package maksim.labs.l_1_4;

/**
 * Created by Пк on 02.03.2017.
 */
public class Lab1_4_3 {
    public static void main(String[] args) {
        boolean t1 = true;
        boolean t2 = true;
        boolean f1 = false;
        boolean f2 = false;
        System.out.println("OR");
        System.out.println("true OR true = "+(t1|t2));
        System.out.println("true OR false = "+(t1|f1));
        System.out.println("false OR true = "+(f2|t2));
        System.out.println("false OR false = "+(f1|f2));
        System.out.println();
        System.out.println("AND");
        System.out.println("true AND true = "+(t1&t2));
        System.out.println("true AND false = "+(t1&f1));
        System.out.println("false AND true = "+(f2&t2));
        System.out.println("false AND false = "+(f1&f2));
        System.out.println();
        System.out.println("XOR");
        System.out.println("true XOR true = "+(t1^t2));
        System.out.println("true XOR false = "+(t1^f1));
        System.out.println("false XOR true = "+(f2^t2));
        System.out.println("false XOR false = "+(f1^f2));
        System.out.println();
        System.out.println("NOT");
        System.out.println("NOT true = "+(!t1));
        System.out.println("NOT false = "+(!f1));
        System.out.println("NOT true = "+(!t2));
        System.out.println("NOT false = "+(!f2));

    }
}
