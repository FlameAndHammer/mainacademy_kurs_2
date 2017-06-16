package yuriy.labs.labs_2.labs_2_10_.l_2_11.l_2_11_3;

/**
 * Created by Ruble on 12.06.2017.
 */
public class Person {
    String firstName;
    String lastName;
    int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0)
            throw new InvalidAgeException();
        this.age = age;
    }
}
