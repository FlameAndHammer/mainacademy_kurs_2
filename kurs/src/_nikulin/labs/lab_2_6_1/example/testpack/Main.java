package _nikulin.labs.lab_2_6_1.example.testpack;

import _nikulin.labs.lab_2_6_1.com.mainacad.carpack.Car;
import _nikulin.labs.lab_2_6_1.example.applepack.Apple;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(0.33);
        System.out.println("Weight of apple = " + apple.getWeight());

        Car car = new Car();
        car.setWeight(550.1);
        System.out.println("Weight of car = " + car.getWeight());
    }
}
