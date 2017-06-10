package olena.labs.L_2_10_3;


import java.util.Scanner;

/**
 * Created by elenafostachuk on 6/9/17.
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = Shape.parseShape("Circle:Scarlett:6");
        System.out.println(circle);
        Shape rectangle = Shape.parseShape("Rectangle:Blue: 5,4");
        System.out.println(rectangle);
        Shape triangle = Shape.parseShape("Triangle:Gold:6,6,3");
        System.out.println(triangle);

        System.out.println("__________________________________");
        Scanner sc = new Scanner(System.in);
        Shape[] arrayShape = createArrayShape(sc);
        fillArrayShape(arrayShape, sc);
        printArrayShape(arrayShape);
    }

    public static Shape[] createArrayShape(Scanner sc) {
        System.out.print("Enter the size of shapes'array:");
        int size = sc.nextInt();
        Shape[] arrayShape = new Shape[size];
        return arrayShape;
    }

    public static void fillArrayShape(Shape[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the string describing the shape");
            String shape = sc.next();
            array[i] = Shape.parseShape(shape);
        }
    }

    public static void printArrayShape(Shape[] array) {
        for (Shape element : array) {
            element.draw();
        }
    }
}







