package _nikulin.additional_homework.after_2_8;

import _nikulin.additional_homework.after_2_8.model.Flower;

import java.util.Scanner;


/**
 * Created by Александр on 21.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello at flower shop!");
        System.out.println("Choose your flower");
        Salable[] flowersForSale = new Salable[30];
        int i = 0;
        Scanner sc= new Scanner(System.in);
        int ch = -1;
        while (ch != 0){
            ch = sc.nextInt();
            Salable flower = Flower.createFlower(ch);
            flowersForSale[i] = flower;
            i++;
        }
        System.out.println("Thank you");
        double sum = 0.0;
        for(Salable goods: flowersForSale){
            if (goods != null) {
                sum += goods.calculatePrice();
            }
        }
        System.out.println("Your pricce is " + String.format("%(.2f", sum));
    }
}
