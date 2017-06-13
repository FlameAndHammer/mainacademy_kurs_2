package yuriy.labs.l_2_03;

/**
 * Created by Ruble on 03.04.2017.
 */

                 /*   Lab Work 2-3-1
        1) Create class MyWindow with fields width (of double type), height (of double type),
        numberOfGlass(of int type), color(of String type), isOpen(boolean).
        2) Create five instances of class MyWindow with different fields values.
        3) Add method printFields() to MyWindow class that print all fields values to console.
*/
public class MyWindow {
    public double width;
    public double height;
    public int numberOfGlass;
    public String color;
    public boolean isOpen;

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public int getNumberOfGlass() { return numberOfGlass; }
    public void setNumberOfGlass(int numberOfGlass) { this.numberOfGlass = numberOfGlass; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isOpen() { return isOpen; }
    public void setOpen(boolean open) { isOpen = open; }


    public static boolean randBoolean (){
        boolean randBool = true;
        int rand = (int) (Math.random() * 2);
        switch (rand){
            case 0: {randBool = false; break;}
            case 1: {randBool = true; break;}
        }
        return randBool;
    }
    public static String randColor (){
        String randColor = "";
        int rand = (int) (Math.random() * 23);
        switch (rand){
            case 0: {randColor = "red"; break;}
            case 1: {randColor = "orange"; break;}
            case 2: {randColor = "yellow"; break;}
            case 3: {randColor = "green"; break;}
            case 4: {randColor = "blue"; break;}
            case 5: {randColor = "purple"; break;}
            case 6: {randColor = "pink"; break;}
            case 7: {randColor = "black"; break;}
            case 8: {randColor = "gray"; break;}
            case 9: {randColor = "brown"; break;}
            case 10: {randColor = "maroon"; break;}
            case 11: {randColor = "white"; break;}
            case 12: {randColor = "amber"; break;}
            case 13: {randColor = "gold"; break;}
            case 14: {randColor = "bronze"; break;}
            case 15: {randColor = "emerald"; break;}
            case 16: {randColor = "aquamarine"; break;}
            case 17: {randColor = "azure"; break;}
            case 18: {randColor = "turquoise"; break;}
            case 19: {randColor = "light blue"; break;}
            case 20: {randColor = "ultramarine"; break;}
            case 21: {randColor = "light pink"; break;}
            case 22: {randColor = "scarlet"; break;}

        }
        return randColor;
    }

    public void printFields (){
        System.out.print("MyWindow: width: " + width);
        System.out.print("\theight: " + height);
        System.out.print("\tnumberOfGlass: " + numberOfGlass);
        System.out.print("\tisOpen: " + isOpen);
        System.out.println("\tcolor: " + color);
    }
    /*
    Lab Work 2-3-2
    1) Add to class MyWindow constructor without parameters, which will initialize class’s
    fields by some default values.
    */
    public MyWindow (){
        width = 350;
        height = 500;
        numberOfGlass = 4;
        color = "white";
        isOpen = true;

    }
    public MyWindow (double width, double height){
        this.width = width;
        this.height = height;
    }
    public MyWindow (double width, double height, int numberOfGlass){
       /* Lab Work 2-3-3
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;*/

        //Lab Work 2-3-4
        this(width,  height,  numberOfGlass, "green", false);
    }
    public MyWindow (double width, double height, int numberOfGlass, String color){
       /* Lab Work 2-3-3
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;*/
        //Lab Work 2-3-4
       this(width,  height,  numberOfGlass, color, false);
    }
    public MyWindow (double width, double height, int numberOfGlass, String color, boolean isOpen){
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;

    }

}
