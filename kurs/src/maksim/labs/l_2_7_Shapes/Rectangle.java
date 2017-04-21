package maksim.labs.l_2_7_Shapes;

/**
 * Created by Пк on 19.04.2017.
 */
public class Rectangle extends Shape {

    private double width,
                   height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double calcArea(){
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width = " + width + ", height = " + height;
    }
}
