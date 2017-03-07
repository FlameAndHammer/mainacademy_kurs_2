package maksim.labs.l_1_4;

/**
 * Created by Пк on 02.03.2017.
 */
public class Lab1_4_4 {
    public static void main(String[] args) {
        int i = 0, decb, deca, incb, inca ;
        System.out.println("i = "+i+", x = --i");
        decb = --i;
        System.out.println("decrement before usage. i = "+i+", x = "+decb);
        i = 0;
        System.out.println();
        System.out.println("i = "+i+", x = ++i");
        incb = ++i;
        System.out.println("increment before usage. i = "+i+", x = "+incb);
        i = 0;
        System.out.println();
        System.out.println("i = "+i+", x = i--");
        deca = i--;
        System.out.println("decrement after usage. i = "+i+", x = "+deca);
        i = 0;
        System.out.println();
        System.out.println("i = "+i+", x = i++");
        inca = i++;
        System.out.println("increment after usage. i = "+i+", x = "+inca);

    }
}
