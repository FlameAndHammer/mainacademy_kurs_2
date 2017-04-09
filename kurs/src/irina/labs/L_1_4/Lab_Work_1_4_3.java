package irina.labs.L_1_4;

/**
 * Created by epub on 3/4/2017.
 */
public class Lab_Work_1_4_3 {
    public static void main(String[] args) {
        boolean a;
        a = 5 >= 4;
        a = 5 != 5;
        System.out.println(a);

        boolean c, b , d;
        b = 5 >= 4;
        d = 10 > 5;
        c = b&d;
        System.out.println(c);

        boolean e, f, k;
        e = 20 != 10;
        f = 10 > 5;
        k = b|d;
        System.out.println(k);

        boolean s, t;
        s = 10 <= 5;
        t = !s;
        System.out.println(t);

        boolean q, n, w;
        q = 435 > 1000;
        n = 100 < 0;
        w = q^n;
        System.out.println(w);


    }
}
