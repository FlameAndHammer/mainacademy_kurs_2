package olena.labs.L_2_5_5;

/**
 * Created by elenafostachuk on 4/14/17.
 */
public class InitTest {
    private int id;
    private static int nextId;

    static {
        nextId = (int) (100 * Math.random());
    }

    public InitTest(){ nextId++;}
    {
        id = nextId;
    }

    public int getId(){return id;}
    public static int getNextId(){ return  nextId;}

}




