package yuriy.labs.l_2_8;

/**
 * Created by Ruble on 09.05.2017.
 */
public class Triangle extends Shape implements Drawable, Comparable {
    private double a, b, c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.rint(100.0 * (Math.sqrt(Math.abs(s * (s - a) * (s - b) * (s - c))))) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " a = " + a + " b = " + b + " c = " + c;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        if (Double.compare(triangle.b, b) != 0) return false;
        return Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ",  area is: " + calcArea());
    }

/*
    @Override
    public int compareTo(Object obj) {
        int result;
        result = Double.compare(this.calcArea(), ((Shape) obj).calcArea());
        return result;
    }
*/
@Override
public int compareTo(Object obj) {
    Shape shapeObj = (Shape)obj;
    int result;
    result = this.shapeColor.compareTo (shapeObj.shapeColor);
    if(result != 0) return result;
    result = Double.compare(this.calcArea(), ((Shape)obj).calcArea());
    return result;
}

}
