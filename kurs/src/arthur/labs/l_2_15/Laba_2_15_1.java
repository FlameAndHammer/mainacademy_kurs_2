package arthur.labs.l_2_15;



import java.util.*;


/**
 * Created by arthk on 13.06.2017.
 * Create new project called TestCollection1. Add package “com.brainacad.oop.testcollection1”.
 * Create a class Main with a main() method. Add to method main() code that declares list variable (of List type)
 * of string objects as ArrayList<String>. Write code to fill this list in loop with string values like: “number_”
 * and number of current iteration (from 0 to 10). Add code which iterates over list and print current element value to console.
 * Execute the program. The program output must be like next example: number_0 number_1 number_2 … number_9
 */
public class Laba_2_15_1  {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
      for (int i=0; i<10; i++)
      {
          arr1.add(i,"number_" + i );
      }

/*                //the 1st way
        Iterator<String> itr = arr1.iterator();
        while (itr.hasNext())
        {
            String element = itr.next();
            System.out.println(element + "");
        }
*/
                    //the 2d way
        for (String cell :arr1)
        {
            System.out.println(cell);
        }

    }

}
