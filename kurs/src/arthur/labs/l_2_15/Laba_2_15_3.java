package arthur.labs.l_2_15;

import java.util.*;


/**
 * Created by arthk on 13.06.2017.
 * Create new project called TestCollection3. Add package “com.brainacad.oop.testcollection3”.
 * Create a class Main with a main() method. Add to method main() code to create both an ArrayList and LinkedList
 * (of String parameter type), and fill each in loop with string values like: “num_” and number of current iteration
 * (from 0 to 10). Print each list using an ordinary Iterator. Then insert one list (ArrayList) into the other (LinkedList)
 * by using an ListIterator, inserting at every other location. Now perform the insertion elements of the first list
 * in reverse order, moving through the element from end to beginning in the second list.
 * Write a static method printElements() that uses an Iterator to step through an Collection and print
 * the each element value in the container. Execute the program.
 */
public class Laba_2_15_3 {
    public static void main(String[] args) {

        //creating an ArrayList
        ArrayList<String> arr1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr1.add(i, "number_" + i);
        }
        System.out.println('\n' +"ArrayList: ");
        printElements (arr1);

        // creating an LinkedList
        LinkedList<String> arr2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arr2.add(i, "number" + (i + 10));
        }
        System.out.println('\n' +"LinkedList 1:");
        printElements (arr2);


        // inserting the ArrayList into the LinkedList in reversal order
        Iterator<String> itr = arr1.iterator();
        while (itr.hasNext()) {
            arr2.addFirst(itr.next());
        }
        System.out.println('\n' + "LinkedList+ArrayList:");
        printElements (arr2);
    }

    public static void printElements(Collection<String> arr ) {
            for (String cell : arr) {
                System.out.println(cell);
            }

    }
}
