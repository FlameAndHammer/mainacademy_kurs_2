package arthur.labs.l_2_7_b.MyShapes;

/**
 * Created by arthk on 24.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape obj1 = new Shape("Red");
        System.out.println(obj1.toString() + '\n');

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
            if (i < 6) array[i] = new Rectangle("Blue", Math.random() * 100, Math.random() * 100);
            if (i > 5 && i < 8) array[i] = new Circle("White", Math.random() * 10);
            if (i > 7) array[i] = new Triangle("Yellow", Math.random() * 10, Math.random() * 10, Math.random() * 10);
        }
        for (Shape cell : array) System.out.println(cell.toString() + ", Area is: " + cell.calcArea());


        System.out.println("Total area is: " + getTotalArea(array));
        double[] areaTypeShape = getSpecificArea(array);
        System.out.println("Rectangles total area is: " + areaTypeShape[0]);
        System.out.println("Circles total area is: " + areaTypeShape[1]);
        System.out.println("Triangles total area is: " + areaTypeShape[2]);

    }
        public static double getTotalArea(Shape[] array) {
            double sumArea = 0.0;
            for (Shape cell : array) {
                sumArea += cell.calcArea();
            }
            return sumArea;
        }

    public static double[] getSpecificArea(Shape[] array) {
        double[] area = new double[3];
        for (Shape cell : array) {
            if (cell instanceof Rectangle)
                area[0] += cell.calcArea();
            else if (cell instanceof Circle)
                area[1] += cell.calcArea();
            else if (cell instanceof Triangle)
                area[2] += cell.calcArea();
        }
        return area;
    }



}
