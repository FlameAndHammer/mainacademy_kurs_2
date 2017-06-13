package yuriy.labs.l_2_08;

import java.util.Arrays;

/**
 * Created by Ruble on 09.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println ("----------------------------------------------------------" + "\n" + "Lab Work 2-8-2:");
        Drawable oneRectangleObject = new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble());
        oneRectangleObject.draw();
        Drawable oneTriangleObject = new Triangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble());
        oneTriangleObject.draw();
        Drawable oneCircleObject = new Circle(Shape.randColor(), Shape.randDouble());
        oneCircleObject.draw();
        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-8-3:");
        Shape rectangleObject1 = new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble());
        Shape rectangleObject2 = new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble());
        System.out.print ("rectangleObject1: "); rectangleObject1.draw();
        System.out.print ("rectangleObject2: "); rectangleObject2.draw();
        System.out.println("\n" + "compareTo (rectangleObject1, rectangleObject2): " + rectangleObject1.compareTo(rectangleObject2));

        Shape circleObject1 = new Circle(Shape.randColor(), Shape.randDouble());
        Shape circleObject2 = new Circle(Shape.randColor(), Shape.randDouble());
        System.out.println();
        System.out.print ("circleObject1: "); circleObject1.draw();
        System.out.print ("circleObject2: "); circleObject2.draw();
        System.out.println("\n" + "compareTo (circleObject1, circleObject2): " + circleObject1.compareTo(circleObject2));

        Shape triangleObject1 = new Triangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble());
        Shape triangleObject2 = new Triangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble());
        System.out.println();
        System.out.print ("triangleObject1: "); triangleObject1.draw();
        System.out.print ("triangleObject2: "); triangleObject2.draw();
        System.out.println("\n" + "compareTo (triangleObject1, triangleObject2): " + triangleObject1.compareTo(triangleObject2));


        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-8-4:");
        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Not sorted array is:");

        Rectangle[] arr2 = new Rectangle[6];
        for (int i = 0; i < arr2.length; i++){
             arr2 [i] = new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble());
             arr2 [i].draw();
        }
        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "The sort array is:");
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++){
            arr2 [i].draw();
        }


        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-8-5:");

        Shape [] arrayOfDifferentShapes = new Shape[10];
        arrayOfDifferentShapes [0] = new Circle(Shape.randColor(), Shape.randDouble());
        for (int i = 1; i < arrayOfDifferentShapes.length; i += 3){
            arrayOfDifferentShapes [i] = new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble());
            arrayOfDifferentShapes [i + 1] = new Triangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble());
            arrayOfDifferentShapes [i + 2] = new Circle(Shape.randColor(), Shape.randDouble());
        }
        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Not sorted array is:");
        for (int i = 0; i < arrayOfDifferentShapes.length; i++){
            arrayOfDifferentShapes [i].draw();
        }
        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "The sort array is:");
        Arrays.sort(arrayOfDifferentShapes);
        for (int i = 0; i < arrayOfDifferentShapes.length; i++){
            arrayOfDifferentShapes [i].draw();
        }

        //int compareRectangle = rectangleObject1.compareTo(rectangleObject2);
        //int compareTo(rectangleObject1,rectangleObject2);
        //System.out.println ("Shape area is: "  + oneShapeObject.calcArea());




/*


        */
/*Shape oneShapeObject = new Shape (Shape.randColor());
        System.out.println ("----------------------------------------------------------" + "\n" + "Lab Work 2-7-6:");
        System.out.println(oneShapeObject.toString());
        System.out.println ("Shape area is: "  + oneShapeObject.calcArea());
*//*

        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-7:");
        Shape oneCircleObject = new Circle(Shape.randColor(), Shape.randDouble());
        System.out.println(oneCircleObject.toString());
        System.out.println("Shape area is: " + oneCircleObject.calcArea());

        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-8:");
        Shape oneRectangleObject = new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble());
        System.out.println(oneRectangleObject.toString());
        System.out.println("Shape area is: " + oneRectangleObject.calcArea());

        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-9:");
        Shape oneTriangleObject = new Triangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble());
        System.out.println(oneTriangleObject.toString());
        System.out.println("Shape area is: " + oneTriangleObject.calcArea());

        System.out.println("\n" + "----------------------------------------------------------" + "\n" + "Lab Work 2-7-10:");
        Shape[] differentShapeObjects = {
                new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Rectangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble()),
                new Circle(Shape.randColor(), Shape.randDouble()),
                new Circle(Shape.randColor(), Shape.randDouble()),
                new Triangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble()),
                new Triangle(Shape.randColor(), Shape.randDouble(), Shape.randDouble(), Shape.randDouble()),
        };
        for (Shape element : differentShapeObjects) {
            System.out.println(element + ",  area is: " + element.calcArea());
        }

        System.out.println("\n" + "The total area of all shape types -> " + calculateTotalAreaOfAllShape(differentShapeObjects));
        System.out.println("The total area of the rectangles  -> " + calculateSumAreaRectangle(differentShapeObjects));
        System.out.println("The total area of the circles     -> " + calculateSumAreaCircle(differentShapeObjects));
        System.out.println("The total area of the triangle    -> " + calculateSumAreaTriangle(differentShapeObjects));

    }

    public static double calculateTotalAreaOfAllShape(Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            sumArea += element.calcArea();
        }
        return Math.rint(sumArea * 100) / 100;
    }

    public static double calculateSumAreaRectangle(Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            if (element instanceof Rectangle) {
                sumArea += element.calcArea();
            }
            ;
        }
        return Math.rint(sumArea * 100) / 100;
    }

    public static double calculateSumAreaCircle(Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            if (element instanceof Circle) {
                sumArea += element.calcArea();
            }
            ;
        }
        return Math.rint(sumArea * 100) / 100;
    }

    public static double calculateSumAreaTriangle(Shape[] arr) {
        double sumArea = 0.0;
        for (Shape element : arr) {
            if (element instanceof Triangle) {
                sumArea += element.calcArea();
            }
            ;
        }
        return Math.rint(sumArea * 100) / 100;
    }

*/




}

}
