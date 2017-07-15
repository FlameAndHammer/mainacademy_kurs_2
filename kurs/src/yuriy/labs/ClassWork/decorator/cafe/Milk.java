package yuriy.labs.ClassWork.decorator.cafe;

/**
 * Created by Ruble on 23.06.2017.
 */
public class Milk implements Drink {

    private Drink sourse;   // источник


    public Milk (Drink sourse)
    {
        this.sourse = sourse;
    }

    @Override
    public void drink()
    {
        sourse.drink();
        System.out.print(" + Milk");
    }
}
