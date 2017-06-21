package yuriy.labs.labs_2.labs_2_10_.l_2_15.l_2_15_5.TestMyGenerator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by Ruble on 20.06.2017.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public LinkedList generate()
    {
        LinkedList<Integer> collection = new LinkedList<>();
        for (int i=0; i<=numOfElm; i++)
        {
            collection.add( i,(int)(Math.random() * (maxNumb + 1)) );
        }
        return collection;
    }

    public Set generateDistinct() {
        Set<Integer> collection = new HashSet<>();
        while (collection.size() < numOfElm)
        //for (int i = 0; i <= numOfElm; i++)
        {
            collection.add( (int) (Math.random() * (maxNumb + 1)) );
        }
        return  collection;
    }
}
