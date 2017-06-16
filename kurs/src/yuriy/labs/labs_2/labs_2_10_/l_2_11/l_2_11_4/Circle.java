package yuriy.labs.labs_2.labs_2_10_.l_2_11.l_2_11_4;

/**
 * Created by Ruble on 09.05.2017.
 */
public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.rint(100.0 * (Math.PI * Math.pow(radius,2))) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius ;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ",  area is: " + calcArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Object obj) {
        Shape shapeObj = (Shape)obj;
        int result;
        result = this.shapeColor.compareTo (shapeObj.shapeColor);
        if(result != 0) return result;
        result = Double.compare(this.calcArea(), ((Shape)obj).calcArea());
        return result;
    }

    public static Circle parseCircle(String string) {
        String[] arrWords = string.split(":");
        return new Circle(arrWords[1], Double.parseDouble(arrWords[2]));
    }
}


