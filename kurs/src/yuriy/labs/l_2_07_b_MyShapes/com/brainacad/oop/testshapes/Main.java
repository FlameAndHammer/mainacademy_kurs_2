package yuriy.labs.l_2_07_b_MyShapes.com.brainacad.oop.testshapes;

/**
 * Created by Ruble on 08.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape oneShapeObject = new Shape (Shape.randColor());
        System.out.println ("----------------------------------------------------------" + "\n" + "Lab Work 2-7-6:");
        System.out.println(oneShapeObject.toString());
        System.out.println ("Shape area is: "  + oneShapeObject.calcArea());

        System.out.println ("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-7:");
        Shape oneCircleObject = new Circle (Shape.randColor(), Shape.randDouble());
        System.out.println(oneCircleObject.toString());
        System.out.println ("Shape area is: "  + oneCircleObject.calcArea());

        System.out.println ("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-8:");
        Shape oneRectangleObject = new Rectangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble());
        System.out.println(oneRectangleObject.toString());
        System.out.println ("Shape area is: "  + oneRectangleObject.calcArea());

        System.out.println ("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-9:");
        Shape oneTriangleObject = new Triangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble());
        System.out.println(oneTriangleObject.toString());
        System.out.println ("Shape area is: "  + oneTriangleObject.calcArea());

        System.out.println ("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-10:");
        Shape[] differentShapeObjects = {
                new Rectangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Circle (Shape.randColor(), Shape.randDouble()),
                new Circle (Shape.randColor(), Shape.randDouble()),
                new Triangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble()),
                new Triangle (Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble()),
        };
        for (Shape element: differentShapeObjects) {
            System.out.println(element + ",  area is: " + element.calcArea());
        }

        System.out.println("\n" + "The total area of all shape types -> " + calculateTotalAreaOfAllShape (differentShapeObjects));
        System.out.println("The total area of the rectangles  -> " + calculateSumAreaRectangle (differentShapeObjects));
        System.out.println("The total area of the circles     -> " + calculateSumAreaCircle (differentShapeObjects));
        System.out.println("The total area of the triangle    -> " + calculateSumAreaTriangle (differentShapeObjects));

    }
    public static double calculateTotalAreaOfAllShape (Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            sumArea += element.calcArea();
        }
        return Math.rint(sumArea * 100) / 100;
    }

    public static double calculateSumAreaRectangle  (Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            if (element instanceof Rectangle) {sumArea += element.calcArea();};
        }
        return Math.rint(sumArea * 100) / 100;
    }

    public static double calculateSumAreaCircle  (Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            if (element instanceof Circle) {sumArea += element.calcArea();};
        }
        return Math.rint(sumArea * 100) / 100;
    }
    public static double calculateSumAreaTriangle  (Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            if (element instanceof Triangle) {sumArea += element.calcArea();};
        }
        return Math.rint(sumArea * 100) / 100;
    }

}
