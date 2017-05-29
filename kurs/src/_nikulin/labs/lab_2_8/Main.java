package _nikulin.labs.lab_2_8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            // lab 2_8_1 and lab 2_8_2
        Shape[] arrayShape = {new Rectangle("White", 4.3, 5.8), new Rectangle("Yellow", 2.4, 1.7),
                    new Rectangle("Pink", 7.1, 2.4), new Rectangle("Brown", 10.6, 2.6),
                    new Rectangle("Orange", 4.4, 5.5), new Circle("Red", 8.8), new Circle("Black", 10.0),
                    new Triangle("Blue", 20.3, 15.2, 10.8), new Triangle("Lilac", 2.6, 8.3, 9.0)};

        for (Shape element: arrayShape)
            element.draw();

            // lab 2_8_3
        System.out.println("-------------------------------------------------------------------------");
//        Rectangle obj_1 = new Rectangle("Green", 10.0, 2.0);
//        Rectangle obj_1 = new Rectangle("Green", 10.0, 20.0);
        Rectangle obj_1 = new Rectangle("Green", 4.0, 12.0);
        Rectangle obj_2 = new Rectangle("Black", 12.0, 4.0);
        if (obj_1.compareTo(obj_2) == 1)
            System.out.println("Rectangle_1 > Rectangle_2");
        else if (obj_1.compareTo(obj_2) == -1)
            System.out.println("Rectangle_1 < Rectangle_2");
        else
            System.out.println("Rectangle_1 == Rectangle_2");

            // lab 2_8_4
        System.out.println("-------------------------------------------------------------------------");
        Shape[] arrayRectangle = {new Rectangle("Blue", 3.5, 5.1), new Rectangle("Blue", 8.5, 1.1),
                    new Rectangle("Red", 13.5, 5.1), new Rectangle("Brown", 0.9, 4.31),
                    new Rectangle("Green", 3.5, 5.1), new Rectangle("Pink", 9.3, 10.3)};
        Arrays.sort(arrayRectangle);
        for (Shape element: arrayRectangle)
            element.draw();

            // lab 2_8_5
        System.out.println("-------------------------------------------------------------------------");
        Shape[] arrShapes = {new Rectangle("White", 4.3, 5.8), new Rectangle("Yellow", 2.4, 1.7),
                new Circle("White", 8.8), new Triangle("Blue", 20.3, 15.2, 10.8),new Rectangle("Pink", 7.1, 2.4),
                new Circle("Black", 10.0), new Rectangle("Orange", 4.4, 5.5), new Circle("Red", 8.8),
                new Rectangle("Brown", 10.6, 2.6), new Triangle("Lilac", 2.6, 8.3, 9.0)};

        System.out.println("Source array:");
        for (Shape element: arrShapes)
            element.draw();

        Arrays.sort(arrShapes, new ShapeColorComparator());
        System.out.println("Sort array:");
        for (Shape element: arrShapes)
            element.draw();
    }
}
