package arthur.labs.l_2_7_b.MyShapes;

import java.util.Comparator;

/**
 * Created by arthk on 22.04.2017.
 * Create new project named MyShapes. Add package “com.brainacad.oop.testshapes”.
 * You should design a super class Shape, which defines the public method of all the shapes
 * called calcArea(), which returns the area (double type) of that particular shape.
 * (Our program uses many kinds of shapes, such as triangle, rectangle and so on.)
 * Define a Shape class as: public class Shape
 * { //declare private instance variable shapeColor of String type
 * // create a constructor for Shape with shapeColor parameter
 * // Override toString() to return the string of Shape name and color, example:
 * “Shape, color is: RED” // All shapes must has a method called calcArea(),
 * write public method (empty) calcArea() that returns double value ( 0.0 ) . }
 * Create class Main with method main(). The program must demonstrate the creation of one Shape object
 * and print it name and color to console. Then add code to invoke calcArea() method
 * and print result to console. Program output must looks like:
 * “This is Shape, color is: RED” “Shape area is: 0”
 */
public abstract class Shape implements Drawable,Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "This is a " + getClass().getSimpleName() + ", shapeColor = " + shapeColor;
    }

    public abstract double calcArea();

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ", Area is: " + calcArea());
    }


    @Override
    public abstract int compareTo(Object o);


                                    // found in the internet
    public static Comparator<Shape> ShapeColorComparator = new Comparator<Shape>() {

        public int compare(Shape shape1, Shape shape2) {

            String ShapeColor1 = shape1.getShapeColor();
            String ShapeColor2 = shape2.getShapeColor();

            //ascending order
            return ShapeColor1.compareTo(ShapeColor2);

            //descending order
            //return ShapeColor2 .compareTo(ShapeColor1 );
        }
    };
}

