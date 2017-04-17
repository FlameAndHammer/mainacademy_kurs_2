package _nikulin.labs.lab_2_7_6__2_7_10;

public class Main {
    public static void main(String[] args) {
            // lab 2_7_6
        Shape object = new Shape("GREEN");
        System.out.println(object);
        System.out.println("Shape area is " + object.calcArea());

            // lab 2_7_7
        System.out.println("----------------------------------------------------------------");
        Shape child_1 = new Circle("RED", 5.5);
        System.out.println(child_1);
        System.out.println("Shape area is " + child_1.calcArea());

            // lab 2_7_8
        System.out.println("----------------------------------------------------------------");
        Shape child_2 = new Rectangle("BLUE", 20.0, 10.0);
        System.out.println(child_2);
        System.out.println("Shape area is " + child_2.calcArea());

            // lab 2_7_9
        System.out.println("----------------------------------------------------------------");
        Shape child_3 = new Triangle("BLACK", 3.0, 4.0, 5.0);
        System.out.println(child_3);
        System.out.println("Shape area is " + child_3.calcArea());

            // lab 2_7_10
        System.out.println("----------------------------------------------------------------");
        Shape[] arrayShape = {new Rectangle("White", 4.3, 5.8), new Rectangle("Yellow", 2.4, 1.7), new Rectangle("Pink", 7.1, 2.4),
                              new Rectangle("Braun", 10.6, 2.6), new Rectangle("Orange", 4.4, 5.5), new Circle("Red", 8.8),
                              new Circle("Black", 10.0), new Triangle("Blue", 20.3, 15.2, 10.8),
                              new Triangle("Lilac", 2.6, 8.3, 9.0)};
        for (Shape element: arrayShape) {
            System.out.println(element + ",  area is: " + element.calcArea());
        }

        System.out.println();
        System.out.println("Total area is " + calcTotalAreaShape(arrayShape));
        double[] areaTypeShape = calcAreaEachTypeShape(arrayShape);
        System.out.println("Rectangles total area " + areaTypeShape[0]);
        System.out.println("Circle total area " + areaTypeShape[1]);
        System.out.println("Triangle total area " + areaTypeShape[2]);
    }

        // lab 2_7_10
    public static double calcTotalAreaShape(Shape[] array) {
        double sumArea = 0.0;
        for (Shape element : array) {
            sumArea += element.calcArea();
        }
        return sumArea;
    }

    public static double[] calcAreaEachTypeShape(Shape[] array) {
        double[] area = new double[3];
        for (Shape element : array) {
            if (element instanceof Rectangle)
                area[0] += element.calcArea();
            else if (element instanceof Circle)
                area[1] += element.calcArea();
            else if (element instanceof Triangle)
                area[2] += element.calcArea();
        }
        return area;
    }
}
