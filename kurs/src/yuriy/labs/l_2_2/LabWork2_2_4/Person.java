package yuriy.labs.l_2_2.LabWork2_2_4;

/**
 * Created by Ruble on 02.04.2017.
 */
/*

Create class Person with fields firstName(String), lastName(String), age(int),
        gender(String), phoneNumber(int), and five overloaded methods that set this fields with
        different arguments list. Create class that will be use instance of class Person and his
        methods.
*/

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public int getPhoneNumber() { return phoneNumber; }


    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }

    public void view (String firstName){System.out.println("firstName: " + firstName); }
    public void view (String firstName, String lastName){
        System.out.print("firstName: " + firstName);
        System.out.println("; lastName: " + lastName);
    }
    public void view (String firstName, String lastName, int age){
        System.out.print("firstName: " + firstName);
        System.out.print("; lastName: " + lastName);
        System.out.println("; age: " + age);
    }
    public void view (String firstName, String lastName, int age, String gender){
        System.out.print("firstName: " + firstName);
        System.out.print("; lastName: " + lastName);
        System.out.print("; age: " + age);
        System.out.println("; gender: " + gender);

    }
    public void view (String firstName, String lastName, int age, String gender,int phoneNumber){
        System.out.print("firstName: " + firstName);
        System.out.print("; lastName: " + lastName);
        System.out.print("; age: " + age);
        System.out.print("; gender: " + gender);
        System.out.println("; phoneNumber: " + phoneNumber);
    }


}
