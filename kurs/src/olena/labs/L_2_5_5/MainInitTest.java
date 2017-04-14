package olena.labs.L_2_5_5;

/**
 * Created by elenafostachuk on 4/14/17.
 */
public class MainInitTest {
    public static void main(String[] args){
        InitTest.getNextId();
        InitTest id1 = new InitTest();
        System.out.println("ID 1:" + id1.getId());
        InitTest id2 = new InitTest();
        System.out.println("ID 1:" + id2.getId());
        InitTest id3 = new InitTest();
        System.out.println("ID 1:" + id3.getId());
        InitTest id4 = new InitTest();
        System.out.println("ID 1:" + id4.getId());
        InitTest id5 = new InitTest();
        System.out.println("ID 1:" + id5.getId());
        InitTest.getNextId();
    }
}
