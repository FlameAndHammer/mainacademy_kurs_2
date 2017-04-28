package slavik.labs.l_2_2;
import java.util.Scanner;
public class MainPerson {
    public static void main(String[] args) {
        Person object = new Person();

        System.out.println("Enter firstName :");
        System.out.println("Enter firstName(If you skip, click \"-\"):");
        Scanner param = new Scanner(System.in);
        String firstName = param.next();
        if (firstName.equals("-")) System.out.println("Skip");

        System.out.println("Enter lastName(If you skip, click \"-\"):");
        String lastName = param.next();
        if (lastName.equals("-")) System.out.println("Skip");

        System.out.println("Enter age(If you skip, click \"0\"):");
        int age = param.nextInt();
        if (age == 0) System.out.println("Skip");

        System.out.println("Enter gender(If you skip, click \"-\"):");
        String gender = param.next();
        if (gender.equals("-")) System.out.println("Skip");

        System.out.println("Enter number phone(If you skip, click \"0\"):");
        int phoneNumber = param.nextInt();
        if (phoneNumber == 0) System.out.println("Skip");

        object.set(firstName, lastName, age, gender, phoneNumber);

        if (phoneNumber == 0 && age == 0 && (gender.equals("-"))  && (firstName.equals("-"))  && (lastName.equals("-")) )  object.view();
        if (phoneNumber == 0 && age == 0 && (gender.equals("-")) && !(lastName.equals("-")) && !(firstName.equals("-")) )  object.view(firstName, lastName);
        if (phoneNumber == 0 && age == 0 && !(lastName.equals("-")) && !(firstName.equals("-"))&& !(gender.equals("-")) ) object.view(firstName, lastName, gender);
        if (age == 0 && !(lastName.equals("-")) && !(firstName.equals("-"))&& !(gender.equals("-")) && phoneNumber != 0) object.view(firstName, lastName, gender, phoneNumber);
        if (phoneNumber == 0 && !(lastName.equals("-")) && !(firstName.equals("-"))&& !(gender.equals("-")) && age != 0) object.view(firstName, lastName, age, gender);
        if  (phoneNumber != 0 && !(lastName.equals("-")) && !(firstName.equals("-"))&& !(gender.equals("-")) && age != 0)   object.view(firstName, lastName, age, gender, phoneNumber);
    }
}