package maksim.labs.l_2_7_Shapes;

/**
 * Created by Пк on 19.04.2017.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    public double calcArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }
}
