package arthur.labs.l_2_15;


import java.util.*;

/**
 * Created by arthk on 13.06.2017.
 * Create new project called TestCollection2. Add package “com.brainacad.oop.testcollection2”.
 * Create a class Main with a main() method. Add to method main() code that declares list variable (of List type)
 * of string objects as LinkedList<String>. Write code to fill this list in loop with string values like:
 * “num_” and number of current iteration (from 0 to 10). But element insertion point must be generated randomly
 * (from 0 to current collection length). Add code which iterates over list and print current element value to console. Execute the program.
 * The program output must be like next example: number_5 number_2 number_7 … number_3
 */
public class Laba_2_15_2 {
    public static void main(String[] args) {
        LinkedList<String> arr2 = new LinkedList<>();
        for (int i=0; i<10; i++)
        {
            arr2.add(i,"number" + (i+10) );
        }
        Collections.shuffle(arr2);
        for (String cell: arr2 )
        {
            System.out.println(cell);
        }
    }
}
