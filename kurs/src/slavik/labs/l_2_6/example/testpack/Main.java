package slavik.labs.l_2_6.example.testpack;

import _nikulin.labs.lab_2_6_1.com.mainacad.carpack.Car;
import slavik.labs.l_2_6.example.applepack.Apple;
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(0.55);
        System.out.println(apple.getWeight());


        Car car = new Car();
        car.setWeight(0.54);
        System.out.println(car.getWeight());
    }
}
