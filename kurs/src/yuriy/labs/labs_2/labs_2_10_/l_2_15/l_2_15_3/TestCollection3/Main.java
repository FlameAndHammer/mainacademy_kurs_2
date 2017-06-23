package yuriy.labs.labs_2.labs_2_10_.l_2_15.l_2_15_3.TestCollection3;

import java.util.*;

/**
 * Created by Ruble on 20.06.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++)
        {
            arrayList.add("arrNumber_" + i);
            linkedList.add("linkNumber_" + i);
        }

        System.out.println("-----------arrayList--------------");
        printElements(arrayList);
        System.out.println("-----------linkedList--------------");
        printElements(linkedList);



        //System.out.println(arrayList.toString());
        System.out.println("-----------arrayList added to linkedList var 2.1--------------");
        Collections.reverse(arrayList);
        for (int i = 10; i > 0; i--)
        {
            linkedList.add(i,arrayList.get(i-1));
        }

        //System.out.println(linkedList.toString());

        printElements(linkedList);


        System.out.println("-----------arrayList added to linkedList var 2.2--------------");
        for (int i = 0; i < 10; i=i+2)
        {
            linkedList.addFirst(arrayList.get(i));
            linkedList.addLast(arrayList.get(i+1));
        }

        //System.out.println(linkedList.toString());

        printElements(linkedList);


        System.out.println("-----------ALL arrayList added to linkedList--------------");
        Collections.reverse(arrayList);
        int a = (int) ( Math.random() * 9 );
        linkedList.addAll(a,arrayList);
        //System.out.println(linkedList.toString());

        printElements(linkedList);


    }

    public static void printElements(Collection<String> list )
    {
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){

            System.out.println(iter.next());
        }
    }
}
