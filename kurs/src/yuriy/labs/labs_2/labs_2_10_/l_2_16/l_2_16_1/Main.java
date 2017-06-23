package yuriy.labs.labs_2.labs_2_10_.l_2_16.l_2_16_1;

/**
 * Created by Ruble on 23.06.2017.
 */


////   Look how works overload resolution with type of reference and concrete class.

public class Main
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal.foo(animal);
        Animal.foo(dog);

        Dog.foo(dog);
        Dog.foo(animal);

    }

}
