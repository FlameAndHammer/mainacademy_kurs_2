package _nikulin.labs.lab_2_3;

public class Main {

    public static void main(String[] args) {
	        // lab 2_3_1
        MyWindow object_1 = new MyWindow(400, 300, "white", 3, true);
        object_1.printFields();
        MyWindow object_2 = new MyWindow(300, 300, "brown", 2, true);
        object_2.printFields();
        MyWindow object_3 = new MyWindow(200, 300, "gray", 2, false);
        object_3.printFields();
        MyWindow object_4 = new MyWindow(300, 400, "light-brown", 3, false);
        object_4.printFields();
        MyWindow object_5 = new MyWindow(400, 400, "light-gray", 5, true);
        object_5.printFields();

            // lab 2_3_2
        System.out.println("---------------------------------------------------");
        MyWindow window = new MyWindow();
        window.printFields();

            // lab 2_3_3
        System.out.println("---------------------------------------------------");
        MyWindow firstWindow = new MyWindow(300, 400);
        firstWindow.printFields();
        MyWindow secondWindow = new MyWindow(400, 500, 3);
        secondWindow.printFields();

            // lab 2_3_4
        System.out.println("---------------------------------------------------");
        MyWindow threeWindow = new MyWindow(500, 500);
        threeWindow.printFields();
        MyWindow fourWindow = new MyWindow(100, 200, 3);
        fourWindow.printFields();

            // lab 2_3_5
        System.out.println("---------------------------------------------------");
        MyWindow[] arrayWindow = new MyWindow[5];
        for (int i=0; i<arrayWindow.length; i++)
            if(i%2 == 0)
                arrayWindow[i] = new MyWindow(300, 300);
            else
                arrayWindow[i] = new MyWindow(200, 200, 3);

        for(MyWindow elem : arrayWindow) {
            elem.printFields();
        }
    }
}
