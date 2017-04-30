package slavik.labs.l_2_3;

public class MyWindow {
        double width;
        double height;
        int numberOfGlass;
        String color;
        boolean isOpen;

         public MyWindow(double width, double height, String color, int numberOfGlass, boolean isOpen) {
            this.width = width;
            this.height = height;
            this.color = color;
            this.numberOfGlass = numberOfGlass;
            this.isOpen = isOpen;
        }

    public MyWindow(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public MyWindow(int width, int height, String color, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.numberOfGlass = numberOfGlass;
    }


    public void printFields() {
            System.out.println(width + " " + height + " " + color + " " + numberOfGlass + " " + isOpen);
        }

    public MyWindow() {
        width = 60;
        height = 60;
        color = "purple";
        numberOfGlass = 2;
        isOpen = true;
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
        color = "gray";
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        //this.width = width;
        //this.height = height;
        //this.numberOfGlass = numberOfGlass;
        this(width, height, "brown", numberOfGlass, true);
    }
 }
