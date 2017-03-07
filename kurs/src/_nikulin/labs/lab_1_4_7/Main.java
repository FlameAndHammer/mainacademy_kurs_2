package _nikulin.labs.lab_1_4_7;

public class Main {
    public static void main(String[] args) {
        int valueInt;
        int expression_1 = 10;
        int expression_2 = -10;
        int value_1 = 2345;
        int value_2 = 1027;

        valueInt = ((value_1 & value_2) > 10) ? expression_1 : expression_2;

        System.out.println("ValueInt = " + valueInt);
    }
}
