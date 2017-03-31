package _nikulin.additional_homework;

/**
 * Created by nikulin on 3/31/2017.
 */
class Employee3 {

  Employee3(String str) {
    System.out.println("ConstructorStr");
  }
  /*Employee3() {
    this();
    System.out.println("ConstructorNoArg");
  }*/
}
public class Main3 {
  public static void main(String[] args) {
    Employee3 e = new Employee3("Java");
  }
}
