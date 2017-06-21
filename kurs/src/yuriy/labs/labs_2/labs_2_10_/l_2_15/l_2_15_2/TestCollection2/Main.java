package yuriy.labs.labs_2.labs_2_10_.l_2_15.l_2_15_2.TestCollection2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Ruble on 19.06.2017.
 */
public class Main
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++)
        {
            int a = (int) ( Math.random() * i );
            list.add(a,"number_" + i );
        }
        System.out.println(list.toString());
        System.out.println("----------------------------------------------");
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }

    }
}
