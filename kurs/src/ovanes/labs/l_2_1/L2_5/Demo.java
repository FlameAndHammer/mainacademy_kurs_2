package ovanes.labs.l_2_1.L2_5;

import kirill.labs.l_2_1.Test;

/**
 * Created by User on 07.04.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Calc square = new Calc();
        square.calcSquare(5.5);
        square.calcSquare(5.0, 6.0);
        square.calcSquare(4);
        square.calcSquare(5,6);

        System.out.println("---------------------------------------");
        TestFinal object = new TestFinal();
        object.squareInt (8);
    }
}
