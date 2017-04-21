package _nikulin.additional_homework.after_2_8.model;

/**
 * Created by Александр on 21.04.2017.
 */
public class Carnation extends Flower {
    public Carnation(String color, double price) {
        super(color, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}
