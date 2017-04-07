package ovanes.labs.l_2_3;

/**
 * Created by User on 07.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyWindow object_A = new MyWindow(400,300,"melange",3,true);
        object_A.printFields();
        MyWindow object_B = new MyWindow(300,200,"grey", 2,false);
        object_B.printFields();
        MyWindow object_C = new MyWindow( 200,10, "blue",1,true);
        object_C.printFields();
        MyWindow object_D = new MyWindow(100,123,"platinum",3,true);
        object_D.printFields();
        MyWindow object_E = new MyWindow(10,1,"pink",1,true);

        System.out.println("------------------------------------------------------------------------------------");
        MyWindow window = new MyWindow();
        window.printFields();


        System.out.println("-------------------------------------------------------------------------------------");
        MyWindow firstWindow = new MyWindow(400,300);
        firstWindow.printFields();
        MyWindow secondWindow = new MyWindow(300,200,14);
        secondWindow.printFields();

        System.out.println("-------------------------------------------------------------------------------------");
        MyWindow threeWindow = new MyWindow(200,100);
        threeWindow.printFields();
        MyWindow fourWindow = new MyWindow(10000,200,4);
        fourWindow.printFields();

        System.out.println("--------------------------------------------------------------------------------------");
        MyWindow[] arrayWindow = new MyWindow[5];
        for (int i=0; i<arrayWindow.length;i++)
            if (i%2 ==0)
                arrayWindow[i]=new MyWindow(500,300);
        else
            arrayWindow[i] =new MyWindow(126,123,22);
for (MyWindow elem: arrayWindow) {
    elem.printFields();
}
    }
}
