package _nikulin.labs.lab_1_4_3;

public class Main {
    public static void main(String[] args) {
        boolean value1 = true;
        boolean value2 = false;

        System.out.println("Value_1 = " + value1);
        System.out.println("Value_2 = " + value2);

            // version 1
        System.out.print("Result_1 operator AND = ");
        System.out.println(value1 & value2);

        // version 2
        System.out.print("Result_2 operator AND = ");
        System.out.println(value1 && value2);

            // vresion 1
        System.out.print("Result_1 operator OR = ");
        System.out.println(value1 | value2);

            // vresion 2
        System.out.print("Result_2 operator OR = ");
        System.out.println(value1 | value2);

        System.out.print("Result operator XOR = ");
        System.out.println(value1 ^ value2);

        System.out.print("Result operator NOT for value1 = ");
        System.out.println(!value1);

        System.out.print("Result operator NOT for value2 = ");
        System.out.println(!value2);
    }
}
