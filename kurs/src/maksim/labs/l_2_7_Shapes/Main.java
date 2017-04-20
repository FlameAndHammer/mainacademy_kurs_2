package maksim.labs.l_2_7_Shapes;

/**
 * Created by Пк on 19.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        int totalRectangles = 5,
            totalCircles = 2,
            totalTriangles = 2;

        double  sumRectanglesArea = 0,
                sumCirclesArea = 0,
                sumTrianglesArea = 0,
                sumTotalArea = 0;
        
        Shape[] arr = new Shape[totalRectangles + totalCircles + totalTriangles];

        for (int i = 0; i < totalRectangles; i++) {
            arr[i] = new Rectangle("PURPLE",Math.random() * 100, Math.random() * 100);
        }
        for (int i = totalRectangles; i < totalCircles + totalRectangles; i++) {
            arr[i] = new Circle("GREEN", Math.random() * 100);
        }
        for (int i = totalRectangles + totalCircles; i < totalTriangles + totalRectangles + totalCircles; i++){
            arr[i] = new Triangle("BLUE", Math.random() * 100,Math.random() * 100,Math.random() * 100);
        }

        for (Shape x : arr) {

            if (x instanceof Rectangle)
                sumRectanglesArea += x.calcArea();
            else if (x instanceof Circle)
                sumCirclesArea += x.calcArea();
            else if (x instanceof Triangle)
                sumTrianglesArea += x.calcArea();


            sumTotalArea += sumRectanglesArea + sumCirclesArea + sumTrianglesArea;
        }

        Shape anyShape = new Shape("RED");
        System.out.println(anyShape);
        System.out.println("Shape area is " + anyShape.calcArea());

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");

        Shape circleShape = new Circle("GREEN", 22);
        System.out.println(circleShape);
        System.out.println("Shape area is " + String.format("%(.2f", circleShape.calcArea()));

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");

        Shape rectangleShape = new Rectangle("PURPLE", 11, 22);
        System.out.println(rectangleShape);
        System.out.println("Shape area is " + rectangleShape.calcArea());

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");

        Shape triangleShape = new Triangle("BLUE", 5, 6, 7);
        System.out.println(triangleShape);
        System.out.println("Shape area is " + String.format("%(.2f", triangleShape.calcArea()));


        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
        System.out.println("Total rectangles area = " + String.format("%(.2f",sumRectanglesArea));
        System.out.println("Total circles area = " + String.format("%(.2f",sumCirclesArea));
        System.out.println("Total triangles area = " + String.format("%(.2f",sumTrianglesArea));
        System.out.println("Total all shapes area = " + String.format("%(.2f",sumTotalArea));

    }
}
