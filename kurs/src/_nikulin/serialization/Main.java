package _nikulin.serialization;

import java.io.*;

public class Main {

  public static final String FILE = "./ins.ser";

  public static void main(String[] args) {

    MyClassFOrSer instance = new MyClassFOrSer(15, "Hello", "SomeStr");
    instance.setParentstr("String in parent");
    Object newInst = null;

    try (FileOutputStream fileStream = new FileOutputStream(FILE);
         ObjectOutputStream outputStream = new ObjectOutputStream(fileStream)) {
      outputStream.writeObject(instance);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (FileInputStream fileInput = new FileInputStream(FILE);
         ObjectInputStream inputStream = new ObjectInputStream(fileInput)) {
      newInst = inputStream.readObject();
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(instance);
    System.out.println(newInst);

    System.out.println(instance == newInst);

  }

}
