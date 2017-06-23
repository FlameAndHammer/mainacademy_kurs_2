package yuriy.labs.decorator.cafe;

/**
 * Created by Ruble on 23.06.2017.
 */
public class Cocolate implements Drink {
    private Drink sourse;

    public Cocolate(Drink sourse) {
        this.sourse = sourse;
    }

    @Override
    public void drink() {
        sourse.drink();
        System.out.print(" + Cocolate");


    }
}
