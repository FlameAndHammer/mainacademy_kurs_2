package _nikulin.additional_homework;

/**
 * Created by nikulin on 3/31/2017.
 */
class Employee4 {

  Employee4(String str) {

    System.out.println("ConstructorStr");
  }
  Employee4() {

    System.out.println("ConstructorNoArg");
  }
}
public class Main3 {
  public static void main(String[] args) {
    Employee4 e = new Employee4("Java");
  }
}
