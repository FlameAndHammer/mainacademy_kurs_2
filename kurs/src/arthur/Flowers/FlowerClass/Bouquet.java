package arthur.Flowers.FlowerClass;


import arthur.Flowers.Saleable;

/**
 * Created by arthk on 21.04.2017.
 */
public class Bouquet implements Saleable {
    private String name;
    private Flower[] bouquetArray = new Flower[3];

    public Bouquet(String name) {
        switch (name) {
            case "Spring":
                bouquetArray[0] = new Tulip("red", 45.10f);
                bouquetArray[1] = new Peony("yellow", 55.75f);
                bouquetArray[2] = new Rose("red", 78.33f);
                break;

            default:
                bouquetArray[0] = new Carnation("red", 35.00f);
                bouquetArray[1] = new Carnation("red", 35.00f);
                bouquetArray[2] = new Carnation("red", 35.00f);
        }
    }

    @Override
    public float calculatePrice() {
        float bouquetPrice= 0;
        for (Flower fl: bouquetArray) bouquetPrice += fl.getPrice();
        return bouquetPrice;
    }
}




