package arthur.Flowers.FlowerClass;

/**
 * Created by arthk on 21.04.2017.
 * The buyer wants to buy flowers in a flower shop.
 He goes to the store and takes flowers of various varieties (roses, carnations, tulips, peonies).
 Each flower has its own value and color.
 In addition, the buyer can take a bouquet, which will consist of several colors. Has a name.
 Bouquet prices are calculated from the cost of flowers included in it.
 Write a method. Which will calculate the cost of any buyer's basket and without avoiding duplicate code.
 hint
 - each sort of flowers is a separate class.
 - You can use interfaces to get the cost
 */
public class Rose extends Flower {
    public Rose (String color, float price){
        super(color,price);
    }

    @Override
    public float calculatePrice() {return getPrice();}
}
