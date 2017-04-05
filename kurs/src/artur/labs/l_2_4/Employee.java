package artur.labs.l_2_4;

/**
 * Created by Arthur on 04.04.2017..
 * 1) Create Employee class with fields firstName, lastName, occupation, telephone
 * and static field numberOfEmployees and getters/setters.
 * 2) Class must have constructor, which will initialize class fields and increment numberOfEmployees.
 * 3) Create multiple instances of Employee class
 * and the output numberOfEmployees field to the console.
 */
public class Employee {
    private static int numberOfEmployees;
    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;

    public Employee (String telephone ){
        this.firstName = "First Name " + (numberOfEmployees +1);
        this.lastName = "Last Name "+ (numberOfEmployees +1);
        this.occupation = "Trainee";
        this.telephone = telephone;
        numberOfEmployees++;
    }




    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
