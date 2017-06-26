package arthur.Decorator;

/**
 * Created by arthk on 26.06.2017.
 */
public abstract class Additive extends Beverage implements Drinkable {
     Beverage source;

    @Override
    public void toDrink() {
    }
}
