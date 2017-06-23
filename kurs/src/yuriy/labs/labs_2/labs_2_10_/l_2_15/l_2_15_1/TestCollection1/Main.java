package yuriy.labs.labs_2.labs_2_10_.l_2_15.l_2_15_1.TestCollection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ruble on 19.06.2017.
 */
public class Main
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            list.add("number_" + i);
        }
        System.out.println(list.toString());

        System.out.println("----------------------------------------------");
        for (String cell :list)
        {
            System.out.println(cell);
        }

        System.out.println("----------------------------------------------");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }
    }
}
