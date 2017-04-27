package arthur.labs.l_2_7_b.MyShapes;

import java.util.Arrays;

/**
 * Created by arthk on 24.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        Circle obj2 = new Circle("White", 34.3);
        System.out.println(obj2.toString());
        System.out.println("Shape area is: " + obj2.calcArea() + '\n');

        Rectangle obj3 = new Rectangle("Blue", 34.2, 23.5);
        System.out.println(obj3.toString());
        System.out.println("Shape area is: " + obj3.calcArea() + '\n');

        Triangle obj4 = new Triangle("Yellow", 34.2, 23.5, 17.7);
        System.out.println(obj4.toString());
        System.out.println("Shape area is: " + obj4.calcArea() + '\n');


        Shape[] array = new Shape[9];
        for (int i = 0; i < 9; i++) {
            if (i <= 4) array[i] = new Rectangle("Blue", Math.random() * 100, Math.random() * 100);
            if (i > 4 && i <= 6) array[i] = new Circle("White", Math.random() * 10);
            if (i > 6) array[i] = new Triangle("Yellow", Math.random() * 10, Math.random() * 10, Math.random() * 10);
        }

        System.out.println("Method to String");
        for (Shape cell : array) System.out.println(cell.toString() + ", Area is: " + cell.calcArea());


        System.out.println("Total area is: " + getTotalArea(array));
        System.out.println("Rectangles total area is: " + getSpecificArea(array)[0]);
        System.out.println("Circles total area is: " + getSpecificArea(array)[1]);
        System.out.println("Triangles total area is: " + getSpecificArea(array)[2]);

                                // lab_2.8.3  compare 2 Rectangles by area
        System.out.println('\n' + "Method draw");
        for (Shape cell: array) cell.draw();
        System.out.println("Compare Triangles: " + array[7].compareTo(array[8]));

                                // lab_2.8.4 sort Shapes by area with compareTo
        Rectangle[] arrayRect = new Rectangle[6];
        for (int i=0; i<6; i++) arrayRect[i] = new Rectangle("Green", Math.random() * 100, Math.random() * 100);
        Arrays.sort(arrayRect);
        System.out.println('\n' + "Rectangles sort");
        for (Rectangle cell : arrayRect) cell.draw();

                                // lab_2.8.5   sort Shapes by color with comparator

        Shape[] arrayShape = new Shape[10];
        arrayShape[0] = new Rectangle("White", Math.random() * 100, Math.random() * 100);
        arrayShape[1] = new Circle("Whita", Math.random() * 100);
        arrayShape[2] = new Triangle("Yellow56", Math.random() * 100, Math.random() * 100, Math.random() * 100);
        arrayShape[3] = new Rectangle("Greenaki", Math.random() * 100, Math.random() * 100);
        arrayShape[4] = new Circle("Black", Math.random() * 100);
        arrayShape[5] = new Triangle("Red", Math.random() * 100, Math.random() * 100, Math.random() * 100);
        arrayShape[6] = new Rectangle("Green", Math.random() * 100, Math.random() * 100);
        arrayShape[7] = new Circle("White", Math.random() * 100);
        arrayShape[8] = new Triangle("Yellow", Math.random() * 100, Math.random() * 100, Math.random() * 100);
        arrayShape[9] = new Triangle("Reda", Math.random() * 100, Math.random() * 100, Math.random() * 100);

        Arrays.sort(arrayShape,Shape.ShapeColorComparator);
        System.out.println('\n' + "Shapes sort");
        for (Shape cell : arrayShape) System.out.println(cell.getClass().getSimpleName() + ", " + cell.getShapeColor().toUpperCase());

    }
        public static double getTotalArea(Shape[] array) {
            double sumArea = 0.0;
            for (Shape cell : array) sumArea += cell.calcArea();
            return sumArea;
        }

    public static double[] getSpecificArea(Shape[] array) {
        double[] area = new double[3];
        for (Shape cell : array) {
            if (cell instanceof Rectangle)      area[0] += cell.calcArea();
            else if (cell instanceof Circle)    area[1] += cell.calcArea();
            else if (cell instanceof Triangle)  area[2] += cell.calcArea();
        }
        return area;
    }
}
