package arthur.Decorator;

/**
 * Created by arthk on 26.06.2017.
 */
public class Milk extends Additive {

    @Override
    public void toDrink() {
        source.toDrink();
        System.out.print(" + Milk");

    }

    public Milk (Beverage source){
        this.source = source;
    }
}
