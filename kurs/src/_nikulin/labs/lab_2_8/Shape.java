package _nikulin.labs.lab_2_8;

public abstract class Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color: " + shapeColor;
    }

        // lab 2_8_2
    @Override
    public void draw() {
        System.out.println(this + ",  area is: " + calcArea());
    }

        // lab 2_8_3
    @Override
    public int compareTo(Object o) {
        Shape other = (Shape)o;
        if (this.calcArea() > other.calcArea())
            return 1;
        if (this.calcArea() < other.calcArea())
            return -1;
        return 0;
    }

    public String getShapeColor() {
        return shapeColor;
    }
}
