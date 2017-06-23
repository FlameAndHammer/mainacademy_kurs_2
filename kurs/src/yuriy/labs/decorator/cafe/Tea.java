package yuriy.labs.decorator.cafe;

/**
 * Created by Ruble on 23.06.2017.
 */
public class Tea implements Drink {
    @Override
    public void drink() {
        System.out.print("Tea");
    }
}
