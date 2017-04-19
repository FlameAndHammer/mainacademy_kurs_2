package maksim.labs.l_2_7_Shapes;

/**
 * Created by Пк on 19.04.2017.
 */
public class Shape {
    private static String shapeColor;

    public Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }


    public double calcArea(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is " + shapeColor;
    }
}
