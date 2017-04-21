package maksim.labs.l_2_7_Shapes;

/**
 * Created by Пк on 19.04.2017.
 */
public class Triangle extends Shape {

    private double sideA,
                   sideB,
                   sideC;

    public Triangle (String shapeColor, double sideA, double sideB, double sideC) {
        super(shapeColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calcArea(){
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public String toString() {
        return super.toString() + ", side a = " + sideA + ", side b = " + sideB + ", side с = " + sideC;
    }
}
