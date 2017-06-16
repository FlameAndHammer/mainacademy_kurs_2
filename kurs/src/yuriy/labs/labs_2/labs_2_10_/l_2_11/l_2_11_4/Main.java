package yuriy.labs.labs_2.labs_2_10_.l_2_11.l_2_11_4;

import java.util.Scanner;

/**
 * Created by Ruble on 09.05.2017.
 */
public class Main {
    public static void main(String[] args) {

/*        System.out.println ("----------------------------------------------------------" + "\n" + "Lab Work 2-10-3:");
        Shape shape1 = Shape.parseShape("Rectangle:RED:10,20");
        System.out.println(shape1);
        Shape shape2 = Shape.parseShape("Triangle:GREEN:9,7,12");
        System.out.println(shape2);
        Shape shape3 = Shape.parseShape("Circle:BLACK:10");
        System.out.println(shape3);

        System.out.println ("----------------------------------------------------------" + "\n" + "Lab Work 2-10-4:");
        Shape shape4 = Shape.parseShape2("Rectangle:BLACK:10,20");
        Shape shape6 = Shape.parseShape2("Circle:GREEN:10");
        Shape shape5 = Shape.parseShape2("Triangle:RED:9,7,12");
        System.out.println(shape4);
        System.out.println(shape5);
        System.out.println(shape6);*/


        System.out.println ("----------------------------------------------------------" + "\n" + "Lab Work 2-11-4:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array of shape -> ");
        int sizeOfArray = sc.nextInt();
        Shape[] shapesArray = new Shape[sizeOfArray];
        try {
          for (int i=0; i<shapesArray.length; i++) {

            System.out.print("Enter shape: ");
            Shape shape = Shape.parseShape2
                    (sc.next());
            shape.draw();

           /* System.out.print("Enter the string creating the shape: ");
            String shape = sc.next();
            shapesArray[i] = Shape.parseShape2(shape);
            shapesArray[i].draw();*/
          }
        }
        catch (Exception e) {
            System.out.println(e);
        }




}

}
