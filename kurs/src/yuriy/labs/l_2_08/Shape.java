package yuriy.labs.l_2_08;

/**
 * Created by Ruble on 09.05.2017.
 */
public abstract class Shape implements Drawable, Comparable {


    public String shapeColor;
    //double sumArea;
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
        //sumArea = sumArea + calcArea();
    }
    public abstract double calcArea();
/*

    public double getSumArea() {
        return sumArea;
    }
*/

    @Override
    public String toString() {
        return "\n" + "This is " + getClass().getSimpleName() + ", color is: " + '\'' + shapeColor +'\'';
    }
    public static String randColor (){
        String randColor = "";
        int rand = (int) (Math.random() * 23);
        switch (rand){
            case 0: {randColor = "RED"; break;}
            case 1: {randColor = "ORANGE"; break;}
            case 2: {randColor = "YELLOW"; break;}
            case 3: {randColor = "GREEN"; break;}
            case 4: {randColor = "BLUE"; break;}
            case 5: {randColor = "PURPLE"; break;}
            case 6: {randColor = "PINK"; break;}
            case 7: {randColor = "BLACK"; break;}
            case 8: {randColor = "GRAY"; break;}
            case 9: {randColor = "BROWN"; break;}
            case 10: {randColor = "MAROON"; break;}
            case 11: {randColor = "WHITE"; break;}
            case 12: {randColor = "AMBER"; break;}
            case 13: {randColor = "GOLD"; break;}
            case 14: {randColor = "BRONZE"; break;}
            case 15: {randColor = "EMERALD"; break;}
            case 16: {randColor = "AQUAMARINE"; break;}
            case 17: {randColor = "TURQUOISE"; break;}
            case 18: {randColor = "AZURE"; break;}
            case 19: {randColor = "LIGHT BLUE"; break;}
            case 20: {randColor = "ULTRAMARINE"; break;}
            case 21: {randColor = "LIGHT PINK"; break;}
            case 22: {randColor = "SCARLET"; break;}
        }
        return randColor;
    }
    public static double randDouble() {
        double randDouble = Math.rint((Math.random () * 1500))/100;
        return randDouble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;

        Shape shape = (Shape) o;

        return shapeColor.equals(shape.shapeColor);
    }

    @Override
    public int hashCode() {
        return shapeColor.hashCode();
    }

    @Override

    public int compareTo(Object o) {
        return 0; //TODO implement
    }
/*
   @Override
    public int compareTo(Shape obj) {
        int result;
        String str = this.shapeColor;
        result = str.compareTo(obj.shapeColor);
        return result;
    }*/
}


/*

interface Comparable {
     int compareTo(Shape obj);

}
*/
