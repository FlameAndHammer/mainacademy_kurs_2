package _nikulin.labs.lab_2_2_5;

public class Demo {
    public static void main(String [] args) {
        Calc square = new Calc();
        square.calcSquare(10.5);
        square.calcSquare(10.0, 5.0);
        square.calcSquare(4);
        square.calcSquare(5, 9);

        System.out.println("-----------------------");
        TestFinal object = new TestFinal();
        object.squareInt(8);
    }
}
