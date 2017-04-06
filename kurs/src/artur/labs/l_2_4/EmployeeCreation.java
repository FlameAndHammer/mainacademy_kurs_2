package artur.labs.l_2_4;

/**
 * Created by Arthur on 04.04.2017.
 */
public class EmployeeCreation {
    public static String phoneGenerator (){
        String phone =  ((int)(Math.random() * 10_000_000)) + "" ;
        return phone;
    }

    public static void main(String[] args) {

        Employee empl1 = new Employee(phoneGenerator());
        Employee empl2 = new Employee(phoneGenerator());
        Employee empl3 = new Employee(phoneGenerator());

        System.out.println("First Name: " + empl1.getFirstName()
                        + " | Last Name: " + empl1.getLastName()
                        + " | Occupation: " + empl1.getOccupation()
                        + " | Telephone: " + empl1.getTelephone());

        System.out.println("First Name: " + empl2.getFirstName()
                + " | Last Name: " + empl2.getLastName()
                + " | Occupation: " + empl2.getOccupation()
                + " | Telephone: " + empl2.getTelephone());

        System.out.println("First Name: " + empl3.getFirstName()
                + " | Last Name: " + empl3.getLastName()
                + " | Occupation: " + empl3.getOccupation()
                + " | Telephone: " + empl3.getTelephone());

        System.out.println("Numbers of employees: " + empl1.getNumberOfEmployees());
    }
}
