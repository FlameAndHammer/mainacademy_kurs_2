package olena.labs.L_2_7_6_to_end_2_7;

/**
 * Created by elenafostachuk on 4/21/17.
 */
public class Rectangle extends MyShapes {
    private double width,
                   height;
    public Rectangle(String myShapecolor, double width, double height){
        super(myShapecolor);
        this.width = width;
        this.height = height;
    }
@Override
    public String toString(){return super.toString() + "width= "+ width +"height=" + height;}
    @Override
    public double calcArea(){return  width * height;}
}
