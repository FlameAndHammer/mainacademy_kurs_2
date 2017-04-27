package arthur.labs.l_2_7_b.MyShapes;

/**
 * Created by arthk on 24.04.2017.
 */
public class Rectangle extends Shape implements Comparable {
    private double width;
    private double height;

    @Override
    public double calcArea() {return width * height;}

    @Override
    public String toString() {
        return (super.toString() + ", width = " + width + ", height = " + height);
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rect = (Rectangle) o;
        if(this.calcArea() > rect.calcArea()) return 1;
        if(this.calcArea() < rect.calcArea()) return -1;
        return 0;
    }

}
