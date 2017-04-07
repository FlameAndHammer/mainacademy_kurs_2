package olena.labs.L_2_4;

/**
 * Created by elenafostachuk on 4/7/17.
 */
public class Employee {
    public String firstName,
            lastName,
            occupation,
            telephone;
    private static int numberOfEmployees;

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public Employee(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
        numberOfEmployees++;
    }
    public static void main(String[]args){
        Employee em1 = new Employee();
        Employee em2 = new Employee();
        Employee em3 = new Employee();
        Employee em4 = new Employee();
        System.out.println(getNumberOfEmployees());
    }
}

