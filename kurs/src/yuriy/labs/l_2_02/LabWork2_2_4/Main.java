package yuriy.labs.l_2_02.LabWork2_2_4;

/**
 * Created by Ruble on 02.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Vova");
        person.setLastName("Ivanov");
        person.setAge(21);
        person.setGender("man");
        person.setPhoneNumber(552152);
        person.view(person.getFirstName());
        person.view(person.getFirstName(),person.getLastName());
        person.view(person.getFirstName(),person.getLastName(),person.getAge());
        person.view(person.getFirstName(),person.getLastName(),person.getAge(),person.getGender());
        person.view(person.getFirstName(),person.getLastName(),person.getAge(),person.getGender(),person.getPhoneNumber());


    }



}
