package olena.labs.L_2_7_6_to_end_2_7;

/**
 * Created by elenafostachuk on 4/21/17.
 */
public class Circle extends MyShapes {
    private double radius;
    public Circle (String myshapecolor, double radius){
        super(myshapecolor);
        this.radius = radius;
    }
    @Override
    public double calcArea(){return  Math.PI * radius * radius;}
    @Override
    public String toString(){return  super.toString() + "radius = " + radius;}
}
