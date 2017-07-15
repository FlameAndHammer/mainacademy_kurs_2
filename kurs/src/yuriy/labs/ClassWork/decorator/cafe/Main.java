package yuriy.labs.ClassWork.decorator.cafe;

/**
 * Created by Ruble on 23.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Drink cofe = new Cofe();
        cofe.drink();
        System.out.println();

        Drink latte = new Milk(new Cofe());
        latte.drink();
        System.out.println();


        Drink latte2 = new Milk(new Milk(new Cofe()));
        latte2.drink();
        System.out.println();


        Drink latte3 = new Lemon(new Milk(new Milk(new Cofe())));
        latte3.drink(); //todo use latte3 // sorry, не доглядел....
        System.out.println();

       /* Drink cofe2 = new Cofe(new Cofe());
        cofe.drink();
        System.out.println();
*/
    }
}
