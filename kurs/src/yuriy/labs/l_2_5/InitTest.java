package yuriy.labs.l_2_5;

/**
 * Created by Ruble on 08.04.2017.
 */
/*Lab Work 2-5-5
        Write class InitTest with private field id of int type and static private field nextId of
        integer. Write code that:
        - Initialize static field nextId of some random value (in 1 … 1000 range) once when
class loaded to JVM;
- Increments static field nextId each time when new instance of InitTest created;
        - Initialize field id of nextId field value each time when new instance of InitTest
        created.
        And method getId() which will return value of id.
        Create class Main, which will create five instances of class InitTest and invokes method
        getId() on each instance and print returned value on console.*/
public class InitTest {
    private int id;
    private static int nextId;
    static {
        nextId = (int) (1000 * Math.random());
    }
    { nextId++; }
    { id = nextId;}
    public int getId() {
        return id;
    }

}

class Main5 {
    public static void main(String[] args) {

        InitTest [] initTest1 = new InitTest [5];
        for (int i = 0; i < 5; i++){
            initTest1 [i] = new InitTest();
            System.out.println("initTest [ " + i + " ] -> "+ initTest1 [i].getId());

        }
    }
}
