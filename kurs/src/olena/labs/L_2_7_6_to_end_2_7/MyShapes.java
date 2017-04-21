package olena.labs.L_2_7_6_to_end_2_7;

/**
 * Created by elenafostachuk on 4/21/17.
 */
public class MyShapes {
    private String myShapecolor;
    public MyShapes(String myShapecolor){this.myShapecolor = myShapecolor;}

    public double calcArea() {return  0.0;}

    @Override
    public String toString(){
        return " " +  getClass().getSimpleName() + " " + "color: "  + myShapecolor;}
}
