package _nikulin.labs.lab_2_3;

public class MyWindow {
        // lab 2_3_1
    private double width,
                   height;
    private String color;
    private int numberOfGlass;
    private boolean isOpen;

    public MyWindow(double width, double height, String color, int numberOfGlass, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.numberOfGlass = numberOfGlass;
        this.isOpen = isOpen;
    }

    public void printFields() {
        System.out.println("Window: Width: " + width + "\tHeight: " + height + "\tColor: " + color +
                "\tGlass: " + numberOfGlass + "\tOpen: " + isOpen);
    }

        // lab 2_3_2
    public MyWindow() {
        width = 200;
        height = 400;
        color = "light-gray";
        numberOfGlass = 2;
        isOpen = false;
    }

        // lab 2_3_3 and lab 2_3_4
    public MyWindow(double width, double height) {
        // lab 2_3_3
//        this.width = width;
//        this.height = height;
            // lab 2_3_4
        this(width, height, "white", 2, false);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
            // lab 2_3_3
//        this.width = width;
//        this.height = height;
//        this.numberOfGlass = numberOfGlass;
            // lab 2_3_4
        this(width, height, "gray", numberOfGlass, false);
    }
}
