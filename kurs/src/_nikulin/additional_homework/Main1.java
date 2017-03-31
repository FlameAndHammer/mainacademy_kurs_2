package _nikulin.additional_homework;

/**
 * Created by nikulin on 3/31/2017.
 */
class Employee1 {
  Employee1(byte i) {
    System.out.println("Good day employee!");
  }
  Employee1(short in) {
    System.out.println("Good night employee!");
  }
  Employee1(long l) {
    System.out.println("Good morning employee!");
  }
}
public class Main1 {
  public static void main(String[] args) {
    Employee1 e = new Employee1(6);
  }
}
