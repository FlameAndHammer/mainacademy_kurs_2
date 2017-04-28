package slavik.labs.l_2_2;
public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int phoneNumber;

    public void view(){
        System.out.println("No information");
    }

    public void view(String firstName, String lastName, int age, String gender, int phoneNumber) {
        System.out.println("The method with String and int: " + "firstName:" + this.firstName + " " + "lastName:" + this.lastName + " " + "age:" + this.age  + " " + "gender:" + this.gender + " " + "Phone:" + this.phoneNumber);
    }

    public void view(String firstName, String lastName, int age, String gender) {
        System.out.println("The method with String and int: " + "firstName:" + this.firstName + " " + "lastName:" + this.lastName + " " + "age:" + this.age + " " + "gender:" + this.gender);
    }

    public void view(String firstName, String lastName, String gender, int phoneNumber) {
        System.out.println("The method with String and int: " + "firstName:" + this.firstName + " " + "lastName:" + this.lastName + " " + "gender:" + this.gender + " " + "Phone:" + this.phoneNumber);
    }

    public void view(String firstName, String lastName, String gender) {
        System.out.println("The method with three String : " + "firstName:" + this.firstName + " " + "lastName:" + this.lastName + " " + "gender:" + this.gender);
    }

    public void view(String firstName, String lastName) {
        System.out.println("The method with two String: " + "firstName:" + firstName + " " + "lastName:" + lastName);
    }

    public void set(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}