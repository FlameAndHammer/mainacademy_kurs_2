package slavik.labs.l_2_5;

public class MyInitTest {
    static {
        System.out.println("static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    public MyInitTest() {
        this(100);
        System.out.println("constructor 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest(int d) {
        System.out.println("constructor 2");
    }

    static {
        System.out.println("static initialization block 2");
    }
}
