package arthur.Flowers.FlowerClass;

/**
 * Created by arthk on 21.04.2017.
 */
public class Peony  extends Flower {
    public Peony (String color, float price){
        super(color,price);
    }

    @Override
    public float calculatePrice() {return getPrice();}

}
