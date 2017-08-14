package yuriy.labs.ClassWork.class_24_07_17;

import java.io.*;

/**
 * Created by Ruble on 24.07.2017.
 */
public class Main
{

    public static final String FILE = "./ins.ser";

    public static void main(String[] args) {

        class_24 my = new class_24(25, "ghj");
        class_24 my1 = null;
        try
                (FileOutputStream fileStream = new FileOutputStream(FILE);
                 ObjectOutputStream outputStream = new ObjectOutputStream (fileStream))

        {outputStream.writeObject(my);}
        catch (IOException e) {e.printStackTrace();}

        try (FileInputStream fileInput =  new FileInputStream(FILE);
        ObjectInputStream inputStream = new ObjectInputStream (fileInput);)
        {
            my1 = (class_24)inputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(my.toString());
        System.out.println(my1);
        System.out.println(my == my1);
    }

}
