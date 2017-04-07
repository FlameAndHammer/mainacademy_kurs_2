package olena.labs.L_2_2_2;

/**
 * Created by elenafostachuk on 4/3/17.
 */
public  class Person {
    private String firstName,
                    lastName,
                     gender,
                     agency;
    public int age,
               identificationNumber,
               phoneNumber;
    public void set(String name){name = firstName;}

    public void set(String name,  String name1){
        firstName = name;
        lastName = name1;
    }
    public void set(String firstName, String lastName, String gender, String agency){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.agency = agency;
    }
    public void set(String firstName, String lastName, String gender, String agency, int age,
                    int identificationNumber, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.agency = agency;
        this.age = age;
        this.identificationNumber = identificationNumber;
        this.phoneNumber = phoneNumber;
    }
    public void show(){
        System.out.println("First name: " +firstName + "\tLast name: " + lastName + "\tGender: " + gender +
                "\tAgency: " + agency + "\tAge: " + age + "\tIdentification Number: " + identificationNumber +
        "\tPhone Number: " + phoneNumber);
    }

}



