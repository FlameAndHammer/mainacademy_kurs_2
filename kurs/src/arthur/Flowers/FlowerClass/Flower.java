package arthur.Flowers.FlowerClass;

import arthur.Flowers.Saleable;

/**
 * Created by arthk on 21.04.2017.
 *  * Created by arthk on 21.04.2017.
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

public abstract class Flower implements Saleable {
     private String color;
     private float price;

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public float getPrice() {return price;}
    public void setPrice(float price) {this.price = price;}

    public Flower (String color, float price ) {
         this.color = color;
         this.price = price;
    }

    public static Saleable fillBasket (int choice){
        switch (choice){
            case 1: return new Carnation("red", 35.45f);
            case 2: return new Peony("yellow", 65.55f);
            case 3: return new Rose("red", 75.05f);
            case 4: return new Tulip("red", 45.15f);
            case 5: return new Bouquet("Spring");
            case 6: return new Bouquet("another");
        }
        return null;
    }
}
