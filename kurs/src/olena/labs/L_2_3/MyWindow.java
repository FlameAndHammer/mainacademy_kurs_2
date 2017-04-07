package olena.labs.L_2_3;

/**
 * Created by elenafostachuk on 4/7/17.
 */
public class MyWindow {
    public double height,
            width;
    public String colour;
    public int numberOfGlasses;
    public boolean isOpen;


    public void MyWindow(double height, double width, String colour, int numberOfGlasses, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.colour = colour;
        this.numberOfGlasses = numberOfGlasses;
        this.isOpen = isOpen;
    }

    public void printFields() {
        System.out.println("Window: height: " + height + "\twidth: " + width + "\tcolour: " + colour + "\tglasses: " + numberOfGlasses
                + "\topen: " + isOpen);
    }
    public MyWindow() {
        height = 150;
        width = 100;
        colour = "white";
        numberOfGlasses = 2;
        isOpen = true;
    }

    public MyWindow(double height, double width){
    }

    public MyWindow(double height, double width, String colour, int numberOfGlasses){

    }
}

