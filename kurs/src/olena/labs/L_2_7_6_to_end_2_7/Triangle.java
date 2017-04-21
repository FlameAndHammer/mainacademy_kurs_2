package olena.labs.L_2_7_6_to_end_2_7;

/**
 * Created by elenafostachuk on 4/21/17.
 */
public class Triangle extends MyShapes {
    private double sideA,
                   sideB,
                   sideC;
    public Triangle(String myshapecolor, double sideA, double sideB, double sideC){
        super(myshapecolor);
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
    }
    @Override
    public String toString(){return  super.toString() + "A =" + sideA + "B =" + sideB + "C =" + sideC;}
    @Override
    public double calcArea(){
        double p = ( sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p -sideA) * (p - sideB) * (p - sideC));
    }
}
