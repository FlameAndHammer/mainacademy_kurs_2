package _nikulin.labs.lab_2_2_4;

public class Person {
    private String firstName,
                   lastName,
                   gender;
    private  int age,
                 phoneNumber;
    public void set(String name) {
        firstName = name;
    }
    public void set(String name, String name1) {
        firstName = name;
        lastName = name1;
     }
    public void set(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public void set(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
     }
    public void set(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void show() {
        System.out.println("FirstName: " + firstName + "\tLastName: " + lastName + "\tGender: " + gender +
                "\tAge: " + age + "\tPhone: " + phoneNumber);
    }
}
