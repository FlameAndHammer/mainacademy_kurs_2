package maksim.labs.l_2_3;

/**
 * Created by Пк on 03.04.2017.
 */
public class MyWindow {
    double width;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    /// --- lab 2.3.2 --- ///
    public MyWindow() {
        width = 1.0;
        height = 2.0;
        numberOfGlass = 3;
        color = "white";
        isOpen = false;
    }
    MyWindow mywindow = new MyWindow();

    /// ----------------- ///

    /// --- lab 2.3.3; 2.3.4 --- ///

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this(width, height, numberOfGlass);
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this(width, height, numberOfGlass, color);
        this.isOpen = isOpen;
    }

    ///------------------ ///

    public void myWindow(double width, double height, int numberOfGlass, String color, boolean isOpen){
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public void printFields(){
        System.out.println("Description of your window:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Number of Glass: " + numberOfGlass);
        System.out.println("Color: " + color);
        if (isOpen)
        System.out.println("Open: yes");
        else
        System.out.println("Open: no");

    }
}
