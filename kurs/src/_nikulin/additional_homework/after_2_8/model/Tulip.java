package _nikulin.additional_homework.after_2_8.model;

/**
 * Created by Александр on 21.04.2017.
 */
public class Tulip extends Flower {
    public Tulip(String color, double price) {
        super(color, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
