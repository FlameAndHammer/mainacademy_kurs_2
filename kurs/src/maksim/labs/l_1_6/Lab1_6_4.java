package maksim.labs.l_1_6;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_6_4 {
    public static void main(String[] args) {
        int[] tiredToThinkUpNewVariablesNames;
        System.out.println("How many elements will be in array? ");
        Scanner sc = new Scanner(System.in);
        int elementsQuantity = sc.nextInt();
        tiredToThinkUpNewVariablesNames = new int[elementsQuantity];
        for (int i = 0; i < elementsQuantity; i++){
            System.out.println("Now enter desired numbers (one per row): ");
            Scanner sca = new Scanner(System.in);
            tiredToThinkUpNewVariablesNames[i] = sca.nextInt();
        }
        System.out.println("This is your array unsorted: ");
        System.out.println();
        for (int i = 0; i < elementsQuantity; i++){
            System.out.print("\t" + tiredToThinkUpNewVariablesNames[i] + " ");
        }
        System.out.println();
        Arrays.sort(tiredToThinkUpNewVariablesNames);
        System.out.println();
        System.out.println("This is your array sorted by default: ");
        System.out.println();
        for (int i = 0; i < elementsQuantity; i++){
            System.out.print("\t" + tiredToThinkUpNewVariablesNames[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("What are we looking for?");
        Scanner scan = new Scanner(System.in);
        int lookingFor = scan.nextInt();
        int found = Arrays.binarySearch(tiredToThinkUpNewVariablesNames, lookingFor);
        System.out.println();
        if (found > - 1){
            System.out.println("Your number " + lookingFor + " is in cell #" + (found + 1));
            System.out.println("It could be somewhere else if you put similar numbers in array but in cell #" +
                    (found + 1) + " it exists for sure!");
        }
        else {
            System.out.println("To find something you need to put something. You didn't. So try again.");
        }
    }
}
