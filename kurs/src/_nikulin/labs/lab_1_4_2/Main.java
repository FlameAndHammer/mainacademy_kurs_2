package _nikulin.labs.lab_1_4_2;

public class Main {
    public static void main(String[] args) {
        int value_1 = -10;
        int value_2 = 34;
        int result;
        double resultDivision;

        System.out.println("Value_1 = " + value_1);
        System.out.println("Value_2 = " + value_2);

            // version 1
        result = value_1 + value_2;
        System.out.print("Result_1 addition -> ");
        System.out.println(result);

            // version 2
        System.out.print("Result_2 addition -> ");
        System.out.println(value_1 + value_2);

        System.out.print("Result subtraction -> ");
        System.out.println(value_1 - value_2);

        System.out.print("Result multiplication -> ");
        System.out.println(value_1 * value_2);

        System.out.print("Result modulo -> ");
        System.out.println(value_1 % value_2);

            // version 1
        System.out.print("Result_1 division -> ");
        System.out.println(value_1 / value_2);

            // version 2
        resultDivision = value_1 / value_2;
        System.out.print("Result_2 division -> ");
        System.out.println(resultDivision);

            // version 3
        double value_3 = value_1;
        System.out.print("Result_3 division -> ");
        System.out.println(value_3 / value_2);
    }
}
