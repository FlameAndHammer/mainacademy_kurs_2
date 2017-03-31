package _nikulin.additional_homework;

/**
 * Created by nikulin on 3/31/2017.
 */
class Employee2 {

  Employee2(byte  b)  {

    System.out.println("Good day employee!");

  }

  Employee2(int  in)  {

    System.out.println("Good night employee!");

  }

  Employee2(Object  i)  {

    System.out.println("Good morning employee!");

  }

}

public class Main2 {

  public static void main(String[] args) {

    Employee2 e = new Employee2(new Main2());

  }

}
