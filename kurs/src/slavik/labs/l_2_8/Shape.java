package slavik.labs.l_2_8;

public  abstract class  Shape implements Drawable, Comparable {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color: " + shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(this + ",  area is: " + calcArea());
    }

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
