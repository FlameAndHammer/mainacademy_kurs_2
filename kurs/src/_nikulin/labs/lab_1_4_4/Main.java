package _nikulin.labs.lab_1_4_4;

public class Main {
    public static void main(String[] args) {
        int value_1 = 45;
        System.out.println("Value_1 = " + value_1);

        System.out.print("Result prefix increment for value_1 = ");
        System.out.println(++value_1);

        System.out.print("Result postfix increment for value_1 = ");
        System.out.println(value_1++);

        System.out.print("Result prefix decrement for value_1 = ");
        System.out.println(--value_1);

        System.out.print("Result postfix decrement for value_1 = ");
        System.out.println(value_1--);

        System.out.println();
        int value_2 = -9;
        System.out.println("Value_1 = " + value_1);
        System.out.println("Value_2 = " + value_2);

        System.out.println("Result operation (Value_1++ - --Value_2 * ++Value_1) = " +
                (value_1++ - --value_2 * ++value_1));
    }
}
