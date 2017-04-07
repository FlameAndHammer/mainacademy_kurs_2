package maksim.labs.l_2_5;

import java.util.Random;

/**
 * Created by Пк on 07.04.2017.
 */
public class InitTest {
    private int id;
    private static int nextId;
    static {
        Random rnd = new Random();
        nextId = rnd.nextInt(1000);
    }
    {
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        InitTest test1 = new InitTest();
        System.out.println("Test ID: " + test1.getId());
        InitTest test2 = new InitTest();
        System.out.println("Test ID: " + test2.getId());
        InitTest test3 = new InitTest();
        System.out.println("Test ID: " + test3.getId());
        InitTest test4 = new InitTest();
        System.out.println("Test ID: " + test4.getId());
        InitTest test5 = new InitTest();
        System.out.println("Test ID: " + test5.getId());
    }
}
