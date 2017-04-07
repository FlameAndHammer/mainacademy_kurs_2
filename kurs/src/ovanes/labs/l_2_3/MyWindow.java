package ovanes.labs.l_2_3;

/**
 * Created by User on 07.04.2017.
 */
public class MyWindow {
    private double width, height;
    private String  colour;
    private int numberOfGlass;
    private  boolean isOpen;

public MyWindow (double width,double height,String colour, int numberOfGlass, boolean isOpen) {
this.width = width;
this.height = height;
this.colour = colour;
this.numberOfGlass = numberOfGlass;
this.isOpen = isOpen;
}
public  void printFields() {
    System.out.println( "Window: width: "  + width + "\tHeight: " + height + "\tColor: " + colour + "\tGlass: " + numberOfGlass + "\tOpen: " + isOpen);
}
public MyWindow(){
    width=200;
    height = 400;
    colour = "melange - red";
    numberOfGlass = 3-5;
    isOpen = false;
}
public MyWindow (double width, double height) {
    this(width, height, "melange", 3, false);
}
public MyWindow (double width,double height, int numberOfGlass) {
    this(width, height, "red", 5, false);


}}