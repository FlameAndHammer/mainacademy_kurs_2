package maksim.labs.l_2_4;

/**
 * Created by Пк on 05.04.2017.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private long phoneNumber;
    private static int numberOfEmployees;

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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public Employee(){
        firstName = "Grisha";
        lastName = "Petrov";
        occupation = "Elephant washer";
        phoneNumber = 380987555316L;
        numberOfEmployees++;
    }

    public static void main(String[] args) {
        Employee empl1 = new Employee();
        empl1.setFirstName("Marina");
        empl1.setLastName("Kartavina");
        empl1.setOccupation("Cow milker");
        empl1.setPhoneNumber(380736579124L);
        Employee empl2 = new Employee();
        empl2.setFirstName("Jessy");
        empl2.setLastName("James");
        empl2.setOccupation("Bandit");
        empl2.setPhoneNumber(380447777777L);
        System.out.println(getNumberOfEmployees());
    }
}
