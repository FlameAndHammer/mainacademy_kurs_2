package _nikulin.additional_homework.after_2_8.model;

import _nikulin.additional_homework.after_2_8.Salable;

/**
 * Created by Александр on 21.04.2017.
 */
public class Bouquet implements Salable{
    private int count = 10;
    private int current = 0;
    private Flower[] flowers = new Flower[count];
    private String name;

    public void addFlower(Flower flower){
        if(current == count ){
            count = 3 / 2 * count + 1;
            Flower[] tempFlowers = new Flower[count];
            for (int i = 0; i < flowers.length; i++){
                tempFlowers[i] = flowers[i];
            }
            flowers = tempFlowers;
        }
        current++;
        flowers[current - 1] = flower;
    }

    public Bouquet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double calculatePrice() {
        int sum = 0;
        for(Flower f: flowers){
            if (f != null){
                sum += f.getPrice();
            }
        }
        return sum;
    }
}
