package yuriy.labs.l_2_03;

/**
 * Created by Ruble on 03.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_3 by Yuriy Denezhko:");
        System.out.println();



        MyWindow [] arrayWindow = new MyWindow[5];

        for (int i = 0; i < arrayWindow.length; i++){
            arrayWindow [i] = new MyWindow();

            arrayWindow[i].setWidth((double) (Math.random() * (Math.pow(10, 3))));
            arrayWindow[i].setHeight((double) (Math.random() * (Math.pow(10, 4))));
            arrayWindow[i].setNumberOfGlass((int) (Math.random() * 4) + 1);
            arrayWindow[i].setColor(MyWindow.randColor());
            arrayWindow[i].setOpen(MyWindow.randBoolean());
            arrayWindow[i].printFields();

        }
        /*
    Lab Work 2-3-2
    2) Create instance of class MyWindow using constructor without parameters.
    */
        MyWindow window1 = new MyWindow();
        window1.printFields();
    }

}
