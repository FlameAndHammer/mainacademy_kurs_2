package arthur.Decorator;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by arthk on 26.06.2017.
 */
public class Coffee extends Beverage {

    @Override
    public void toDrink() {
        System.out.print("Coffee");
    }
}
