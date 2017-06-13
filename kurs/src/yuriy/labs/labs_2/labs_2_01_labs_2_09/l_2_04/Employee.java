package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_04;

/**
 * Created by Ruble on 05.04.2017.
 */
/*Lab Work 2-4-4
        1) Create Employee class with fields firstName, lastName, occupation, telephone and
        static field numberOfEmployees and getters/setters.
        2) Class must have constructor, which will initialize class fields and increment
        numberOfEmployees.
        3) Create multiple instances of Employee class and the output numberOfEmployees field
        to the console*/

public class Employee {
    String firstName;
    String lastName;
    String occupation;
    int telephone;
    public static int numberOfEmployees = 0;

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }
    public int getTelephone() { return telephone; }
    public void setTelephone(int telephone) { this.telephone = telephone; }
    public static int getNumberOfEmployees() { return numberOfEmployees; }
    public static void setNumberOfEmployees(int numberOfEmployees) { Employee.numberOfEmployees = numberOfEmployees; }


    public Employee () {
        firstName = "firstName" + numberOfEmployees;
        lastName = "lastName" + numberOfEmployees;
        occupation = "student" + numberOfEmployees;
        telephone = (int) (Math.random () * 100000);
        numberOfEmployees++;
    }
}
 class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_4_4 by Yuriy Denezhko:");
        System.out.println();



        Employee [] arrayEmployee = new Employee[5];

        System.out.print("firstName");
        System.out.print("\tlastName");
        System.out.print("\toccupation");
        System.out.print("\ttelephone");
        System.out.println("\tnumberOfEmployees");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < arrayEmployee.length; i++){
            arrayEmployee [i] = new Employee();
            System.out.print(arrayEmployee [i].firstName);
            System.out.print("\t" + arrayEmployee [i].lastName);
            System.out.print("\t" + arrayEmployee [i].occupation);
            System.out.print("\t" + arrayEmployee [i].telephone);
            System.out.println("\t" + "\t" + "\t" + arrayEmployee [i].numberOfEmployees);

        }

    }
}