package yuriy.labs.decorator.cafe;

/**
 * Created by Ruble on 23.06.2017.
 */
public class Lemon implements Drink {
    private Drink sourse;   // источник

    public Lemon(Drink sourse) {
        this.sourse = sourse;
    }

    @Override
    public void drink() {
        sourse.drink();
        System.out.print(" + Lemon");
    }
}
