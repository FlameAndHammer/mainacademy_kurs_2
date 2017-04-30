package slavik.labs.l_2_3;
public class Main {
    public static void main(String[] args) {
        MyWindow myWindow_1 = new MyWindow(10, 10, "red", 2, true);
        MyWindow myWindow_2 = new MyWindow(20, 20, "green", 3, true);
        MyWindow myWindow_3 = new MyWindow(30, 30, "blue", 2, false);
        MyWindow myWindow_4 = new MyWindow(40, 40, "yellow", 4, true);
        MyWindow myWindow_5 = new MyWindow(50, 50, "black", 2, false);
        System.out.println();
        System.out.println("_____________________ laba_2_3_1____________________");
        myWindow_1.printFields();
        myWindow_2.printFields();
        myWindow_3.printFields();
        myWindow_4.printFields();
        myWindow_5.printFields();
        System.out.println();
        System.out.println("_____________________ laba_2_3_2____________________");
        MyWindow myWindow_2_3_2 = new MyWindow();
        myWindow_2_3_2.printFields();
        System.out.println();
        System.out.println("_____________________ laba_2_3_3____________________");
        MyWindow myWindow_2_3_3_1 = new MyWindow(70, 70);
        myWindow_2_3_3_1.printFields();
        MyWindow myWindow_2_3_3_2 = new MyWindow(80, 80, 3);
        myWindow_2_3_3_2.printFields();
        System.out.println();
        System.out.println("_____________________ laba_2_3_4____________________");
        MyWindow myWindow_2_3_4_1 = new MyWindow(90, 90);
        myWindow_2_3_4_1.printFields();
        MyWindow myWindow_2_3_4_2 = new MyWindow(100, 100, 2);
        myWindow_2_3_4_2.printFields();

        MyWindow[] array = new MyWindow[5];
        System.out.println();
        System.out.println("_____________________ laba_2_3_5____________________");
                array[0] = new MyWindow();
                array[1] = new MyWindow(200, 200);
                array[2] = new MyWindow(200, 200, "pink");
                array[3] = new MyWindow(200, 200, "pink", 2);
                array[4] = new MyWindow(200, 200, "pink", 3, true);
         for(MyWindow obj : array) {
            obj.printFields();
        }
    }
}
