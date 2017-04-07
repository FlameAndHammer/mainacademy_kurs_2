package ovanes.labs.l_2_4;

/**
 * Created by User on 07.04.2017.
 */
public class Employee {
public String firstName;
private String lastName;
private String occupation;
private long phoneNumber;

private static int numbersOfEmployee;

public String getFirstName() {return  firstName;}
public void setFirstName (String firstName) {this.firstName = firstName;}

public String getLastName() {return lastName;}
public void setLastName(String lastName) {this.lastName = lastName;}

public String getOccupation() {return  occupation;}
public void setOccupation (String occupation) {this.occupation = occupation;}

public  long getPhoneNumber() {return  phoneNumber;}
public void setPhoneNumber (long phoneNumber) {this.phoneNumber = phoneNumber;}

public static int getNumbersOfEmployee() {return numbersOfEmployee;}
public  void  setNumbersOfEmployee (int numbersOfEmployee) {this.numbersOfEmployee = numbersOfEmployee;}

public Employee () {
    firstName = "Nishan";
    lastName = "Serov";
    occupation = "PM";
    phoneNumber = 123456788L;
    numbersOfEmployee++;
    }

    public static void main(String[] args) {
        Employee empl_A=new Employee();
        empl_A.setFirstName("Susana");
        empl_A.setLastName("Abramyan");
        empl_A.setOccupation("HRD");
        empl_A.setPhoneNumber(12345789L);
        Employee empl_B = new Employee();
        empl_B.setFirstName("Varseniq");
        empl_B.setLastName("Karapetyan");
        empl_B.setOccupation("accountant");
        empl_B.setPhoneNumber(9876543L);
        System.out.println(getNumbersOfEmployee());
    }
}


