package olena.labs.L_2_10_3;


/**
 * Created by elenafostachuk on 6/9/17.
 */
    public abstract class Shape implements Drawable, Comparable {
    private String shapecolor;

    public Shape(String shapecolor) {
        this.shapecolor = shapecolor;
    }

    public abstract double CalcArea();

    public String toString() {
        return getClass().getSimpleName() + "color :" + shapecolor;
    }

    public void draw() {
        System.out.println(toString() + "area is:" + CalcArea());
    }




    public  int compareTo(Object o){
        Shape other = (Shape)o;
        if(this.CalcArea() > other.CalcArea())
            return 1;
        if (this.CalcArea() < other.CalcArea())
            return -1;
        return 0;
    }
    public String getShapecolor() {
        return shapecolor;
    }

    public static Shape parseShape(String str) {
        Shape obj = null;
        String[] words = str.split(":");
        String[] values = null;
        switch (words[0]) {
            case "Circle":
                obj = Circle.parseCircle(str);
                break;

            case "Rectangle":
                obj = Rectangle.parseRectangle(str);
                break;

            case "Triangle":
                obj = Triangle.parseTriangle(str);
        }

                return obj;

    }
}



