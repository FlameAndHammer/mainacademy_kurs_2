package arthur.labs.l_2_7_b.MyShapes;

/**
 * Created by arthk on 24.04.2017.
 */
public class Triangle extends Shape implements Comparable {
    private double a;
    private double b;
    private double c;

    @Override
    public double calcArea() {
        double s = (this.a + this.b + this.c)  ;
        return Math.sqrt( s * (s - a ) * (s - b) * (s - c)  );
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public int compareTo(Object o) {
        Triangle tr = (Triangle)o;
        if(this.calcArea() > tr.calcArea()) return 1;
        if(this.calcArea() < tr.calcArea()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return ( super.toString() + ", a = " + a + ", b = " + b + ", c = " + c );



    }
}
