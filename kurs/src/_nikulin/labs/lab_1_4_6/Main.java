package _nikulin.labs.lab_1_4_6;

public class Main {
    public static void main(String[] args) {
        int valueInt_1 = 24680;                         // 00000000 00000000 01100000 01101000
        int valueInt_2 = -13579;                        // 11111111 11111111 11001010 11110101

        System.out.println("Value_1 = " + valueInt_1);
        System.out.println("Value_2 = " + valueInt_2);

        System.out.print("Result Bitwise AND = ");
        System.out.println(valueInt_1 & valueInt_2);    // 00000000 00000000 01000000 01100000 = 16480

        System.out.print("Result Bitwise OR = ");
        System.out.println(valueInt_1 | valueInt_2);    // 11111111 11111111 11101010 11111101 = -5379

        System.out.print("Result Bitwise XOR = ");
        System.out.println(valueInt_1 ^ valueInt_2);    // 11111111 11111111 10101010 10011101 = -21859

        System.out.print("Result Bitwise NOT for value_1 = ");
        System.out.println(~valueInt_1);                // 11111111 11111111 10011111 10010111 = -24681

        System.out.print("Result Bitwise NOT for value_2 = ");
        System.out.println(~valueInt_2);                // 00000000 00000000 00110101 00001010 = 13578
    }
}
