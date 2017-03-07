package _nikulin.labs.lab_1_4_5;

public class Main {
    public static void main(String[] args) {
        int value_1 = 16;
        int value_2 = 16;
        int value_3 = -16;
        int countBit = 1;

            // positive number
        System.out.print("Result bitwise left shift: " + value_1 + " << " + countBit + " = ");
        System.out.println(value_1 << countBit);
        System.out.println("Check left shift operation of multiplication -> " + (value_2 * 2));

            // negative number
        System.out.print("Result left shift: " + value_3 + " << " + countBit + " = ");
        System.out.println(value_3 << countBit);
        System.out.println("Check left shift operation of multiplication -> " + (value_3 * 2));

            // positive number
        System.out.println();
        System.out.print("Result right shift: ");
        System.out.print(value_1);
        System.out.print(" >> ");
        System.out.print(countBit);
        System.out.println(" = " + (value_1 >> countBit));
        System.out.println("Check right shift operation of division -> " + (value_2 / 2));

            // negative number
        System.out.print("Result right shift: " + value_3 + " >> " + countBit + " = ");
        System.out.println(value_3 >> countBit);
        System.out.println("Check right shift operation of division -> " + (value_3 / 2));

            // positive number
        System.out.println();
        System.out.print("Result right shift: " + value_1 + " >>> " + countBit + " = ");
        System.out.println(value_1 >>> countBit);

            // negative number
        System.out.print("Result right shift: " + value_3 + " >>> " + countBit + " = ");
        System.out.println(value_3 >>> countBit);
    }
}
