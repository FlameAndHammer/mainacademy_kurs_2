package yuriy.labs.labs_2.labs_2_10_.l_2_10.LabWork_2_10_3__5;

/**
 * Created by Ruble on 09.05.2017.
 */
public class Rectangle extends Shape implements Drawable {
    private double width, height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return Math.rint(100.0 * width * height) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " width = " + width + ", height = " + height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.width, width) != 0) return false;
        return Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ",  area is: " + calcArea());
    }
/*
    @Override
    public int compareTo(Object o) {
        return 0; //super.compareTo(o);
    }*/

    /*
    @Override
    public int compareTo(Shape obj) {
        int result;
        result = Double.compare(this.calcArea(), obj.calcArea());
        return result;
    }*/
    @Override
    public int compareTo(Object obj) {
        Shape shapeObj = (Shape)obj;
        int result;
        result = this.shapeColor.compareTo (shapeObj.shapeColor);
        if(result != 0) return result;
        result = Double.compare(this.calcArea(), ((Shape)obj).calcArea());
        return result;
    }

    public static Rectangle parseRectangle(String string) {
        String[] arrWords = string.split("[:,]");
        return new Rectangle(arrWords[1], Double.parseDouble(arrWords[2]), Double.parseDouble(arrWords[3]));
    }

}
