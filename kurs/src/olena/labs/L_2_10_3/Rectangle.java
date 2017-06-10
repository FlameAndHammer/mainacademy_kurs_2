package olena.labs.L_2_10_3;

/**
 * Created by elenafostachuk on 6/9/17.
 */
public class Rectangle extends Shape {
    public  double width,
    height;
    public Rectangle(String shapecolor, double width, double height){
        super(shapecolor);
        this.width = width;
        this.height = height;
    }
    public String toString(){return super.toString() + ", width = " + width + ", height= " + height; }

    public double CalcArea(){return width * height; }


    public static Rectangle parseRectangle(String value) {
        String[] words = value.split("[:,]");
        return new Rectangle(words[1], Double.parseDouble(words[2]), Double.parseDouble(words[3]));
    }

    }

