package _nikulin.labs.lab_2_5_5;

public class InitTest {
    private int id;
    private static int nextId;

    static {
        nextId = (int)(1000 * Math.random());
    }

    public InitTest() {
        nextId++;
    }

    {
        id = nextId;
    }

    public int getId() {
        return id;
    }

    /*public static int getNextId() {
        return nextId;
    }*/
}
