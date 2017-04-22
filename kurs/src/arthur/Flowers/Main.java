package arthur.Flowers;

import arthur.Flowers.FlowerClass.*;

import java.util.Scanner;

/**
 * Created by arthk on 21.04.2017.
 *  * The buyer wants to buy flowers in a flower shop.
 He goes to the store and takes flowers of various varieties (roses, carnations, tulips, peonies).
 Each flower has its own value and color.
 In addition, the buyer can take a bouquet, which will consist of several colors. Has a name.
 Bouquet prices are calculated from the cost of flowers included in it.
 Write a method. Which will calculate the cost of any buyer's basket and without avoiding duplicate code.
 hint
 - each sort of flowers is a separate class.
 - You can use interfaces to get the cost
 */
public class Main {
    public static void main(String[] args) {
        Saleable[] basket = new Saleable[10];
        System.out.println("Don`t pass by us, select flowers!");
        System.out.println("Input a number: ");
        Scanner sc= new Scanner(System.in);
        int choice = -1;
        int i = 0;
        while (choice != 0){
            choice = sc.nextInt();
            basket[i] = Flower.fillBasket(choice);
            i++;
        }

        float basketCost = 0;
        for (Saleable item: basket) if (item != null) basketCost += item.calculatePrice();
        System.out.println("Total: " + basketCost);
        System.out.println("Thank you for shopping with us!");
        }
}
