package arthur.Decorator;

/**
 * Created by arthk on 26.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Beverage coffee1 = new Coffee();
        coffee1.toDrink();
        System.out.println();

        Beverage latte1 = new Milk(new Coffee());
        latte1.toDrink();
        System.out.println();

        Drinkable latte2 = new Milk (new Milk (new Coffee()));
        latte2.toDrink();
        System.out.println();

    }
}
