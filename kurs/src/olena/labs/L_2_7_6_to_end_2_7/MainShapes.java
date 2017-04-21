package olena.labs.L_2_7_6_to_end_2_7;

/**
 * Created by elenafostachuk on 4/21/17.
 */
public class MainShapes {
    public static void main(String[] args) {
        MyShapes shape = new MyShapes("Anycolor");
        System.out.println(shape);
        System.out.println("shape area is: " + shape.calcArea());

        MyShapes circle1 = new Circle("blue, ", 3.3);
        System.out.println(circle1);
        System.out.println("circle area is:" + circle1.calcArea());

        MyShapes triangle1 = new Triangle("yellow, ", 1.3, 2.4, 3.4);
        System.out.println(triangle1);
        System.out.println("triangle area is: " + triangle1.calcArea());

        MyShapes rectangle1 = new Rectangle("red, ", 4.0, 8.6);
        System.out.println(rectangle1);
        System.out.println("rectangle area is: " + rectangle1.calcArea());

        System.out.println("_______________________________________________________");
        MyShapes[] arrayShape = {new Circle("blue", 3.3), new Circle("white", 4.0),
                new Triangle("yellow", 1.3, 2.4, 3.4), new Triangle("maroon", 6.5, 5.7, 7.8),
                new Rectangle("gray", 6, 5), new Rectangle("gold", 5, 5)};
        for (MyShapes element : arrayShape) {
            System.out.println(element + "element area is:" + element.calcArea());
        }
        System.out.println();
        double [] area = calcAreaEachMyShapes(arrayShape);
        System.out.println("Total area of shapes is :" + calcTotalAreaMyShapes(arrayShape));
        System.out.println("Rectangles total area: " + area[2]);
        System.out.println("Circles total area: " + area[0]);
        System.out.println("Triangles total area: " + area[1]);
    }

    public static double calcTotalAreaMyShapes(MyShapes[] arrayShape) {
        double SumArea = 0.0;
        for (MyShapes element : arrayShape) {
            SumArea += element.calcArea();
        }
        return SumArea;
    }

    public static double[] calcAreaEachMyShapes(MyShapes[] arrayShape) {
        double[] area = new double[3];
        for (MyShapes element : arrayShape) {
            if (element instanceof Circle)
                area[0] += element.calcArea();
            else if (element instanceof Triangle)
                area[1] += element.calcArea();
            else if (element instanceof Rectangle)
                area[2] += element.calcArea();
        }
        return area;
    }
}




