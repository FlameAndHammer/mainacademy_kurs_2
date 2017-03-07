package _nikulin.labs.lab_1_4_8;

public class Main {
    public static void main(String[] args) {
        int valueInt = -56789;
        char valueChar = 'A';
        float valueFloat = 123.456F;
        double valueDouble = 1.2e-200;
        long valueLong = 23L;
        byte valueByte = 45;

        System.out.println("valueInt = " + valueInt);
        System.out.println("valueChar = " + valueChar);
        System.out.println("valueFloat = " + valueFloat);
        System.out.println("valueDouble = " + valueDouble);
        System.out.println("valueLong = " + valueLong);
        System.out.println("valueByte = " + valueByte);

        System.out.println();

        int valueResultInt = valueChar;
        System.out.print("Result casting valueChar in int -> ");
        System.out.println(valueResultInt);

        double valueResultDouble = valueLong;
        System.out.print("Result casting valueLong in double -> ");
        System.out.println(valueResultDouble);

        short valueResultShort = valueByte;
        System.out.print("Result casting valueByte in short -> ");
        System.out.println(valueResultShort);

        System.out.print("Result casting valueInt in byte -> ");
        System.out.println( (byte)valueInt);

        System.out.print("Result casting valueDouble in float -> ");
        System.out.println( (float)valueDouble);

        System.out.print("Result casting valueFloat in int -> ");
        System.out.println( (int)valueFloat);

        System.out.print("Result casting valueLong in byte -> ");
        System.out.println( (byte)valueLong);

        System.out.print("Result casting valueFloat in char -> ");
        System.out.println( (char) valueFloat);
    }
}
