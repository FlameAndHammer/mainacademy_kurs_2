package _nikulin.additional_homework.after_2_8.model;

import _nikulin.additional_homework.after_2_8.Salable;

/**
 * Created by Александр on 21.04.2017.
 */
public abstract class Flower implements Salable {
    private double price;
    private String color;

    public Flower(String color, double price) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " {" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        return color != null ? color.equals(flower.color) : flower.color == null;

    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    public static Salable createFlower(int i){
        switch(i) {
            case 1: return new Rose("Red", 2.5);
            case 2: return new Peony("Blue", 4.5);
            case 3: return new Carnation("Yellow", 7.5);
            case 4: Bouquet bouquet = new Bouquet("Spring");
                bouquet.addFlower(new Rose("Red", 2.5));
                bouquet.addFlower(new Peony("Blue", 4.5));
                bouquet.addFlower(new Tulip("Blue", 21.0));
                return bouquet;
        }
        return null;
    }
}
