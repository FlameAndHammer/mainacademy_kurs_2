package _nikulin.labs.lab_2_4_4;

public class Employee {
    private String firstName,
                   lastName,
                   occupation;
    private  int telephone;
    private static int numberOfEmployees = 0;

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
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
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
