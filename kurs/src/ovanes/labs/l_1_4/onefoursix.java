package ovanes.labs.l_1_4;

/**
 * Created by Asus on 05.03.2017.
 */
public class onefoursix {
    public static void main(String[] args) {
        int a = 23;
        int b = 4;

        int sum = a & b;
        int alternat = a| b;
        int alternativless = a^ b;
        int noa = ~a;
        int nob = ~b;
        System.out.println(sum);
        System.out.println(alternat);
        System.out.println(alternativless);
        System.out.println(noa);
        System.out.println(nob);
    }
}
