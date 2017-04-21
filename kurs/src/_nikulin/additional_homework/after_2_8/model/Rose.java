package _nikulin.additional_homework.after_2_8.model;

/**
 * Created by Александр on 21.04.2017.
 */
public class Rose extends Flower {

    public Rose(String color, double price) {
        super(color, price);
    }

    @Override
    public double calculatePrice() {
        return 0.7 * getPrice();
    }
}
