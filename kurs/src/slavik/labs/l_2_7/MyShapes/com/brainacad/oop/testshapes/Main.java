package slavik.labs.l_2_7.MyShapes.com.brainacad.oop.testshapes;

public class Main {
    public static void main(String[] args) {
        Shape object = new Shape("Red");
        System.out.println(object);
        System.out.println("Shape area is " + object.calcArea());

        Shape obj_1 = new Circle("Green", 10);
        System.out.println(obj_1);
        System.out.println("Shape area is " + obj_1.calcArea());

        Shape obj_2 = new Rectangle("Red", 11, 22);
        System.out.println(obj_2);
        System.out.println("Shape area is " + obj_2.calcArea());

        Shape obj_3 = new Triangle("Black", 5, 5, 5);
        System.out.println(obj_3);
        System.out.println("Shape area is " + obj_3.calcArea());

        Shape[] arrayShape = {new Rectangle("White", 4.3, 5.8), new Rectangle("Yellow", 2.4, 1.7), new Rectangle("Pink", 7.1, 2.4),
                new Rectangle("Braun", 10.6, 2.6), new Rectangle("Orange", 4.4, 5.5), new Circle("Red", 8.8),
                new Circle("Black", 10.0), new Triangle("Blue", 20.3, 15.2, 10.8), new Triangle("Lilac", 2.6, 8.3, 9.0)};

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
