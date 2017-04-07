package ovanes.labs.l_2_1.L2_4;

/**
 * Created by User on 06.04.2017.
 */
public class Person {
    private String firstName, lastName, gender;
    private int age, phoneNmber;

    public void set (String name) {firstName = name;}
    public void set (String name, String name_A){
    firstName = name;
    lastName = name_A;
}
  public  void set(String firstName, String lastName, String gender, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
  }
  public void set (String firstName, String lastName, int age, String gender, int phoneNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.gender=gender;
      this.age = phoneNumber;


  }

public  void show (){
    System.out.println("FirstName: " + firstName + "\tLastName: " + lastName + "\tGender: " + gender + "\tAge: " +age +  "\tPhone:" + phoneNmber);
}}

