package _nikulin.additional_homework;

/**
 * Created by nikulin on 3/31/2017.
 */
class Employee {
  Employee(byte b) {
    System.out.println("Good day employee!");
  }
  Employee(int i) {
    System.out.println("Good night employee!");
  }
}
public class Main {
  public static void main(String[] args) {
    Employee e = new Employee(5);
  }
}
