package maksim.labs.l_2_5;

/**
 * Created by Пк on 06.04.2017.
 */
public class MyInitTest {
    private static String block1;
    private static String block2;
    private static String staticBlock1;
    private static String staticBlock2;
    {
        block1 = "Non-static block1 intialization";
        System.out.println(block1);
    }
    {
        block2 = "Non-static block2 intialization";
        System.out.println(block2);
    }
    static {
         staticBlock1 = "Static block1 intialization";
        System.out.println(staticBlock1);
    }
    static {
        staticBlock2 = "Static block2 intialization";
        System.out.println(staticBlock2);
    }

    public MyInitTest() {
        System.out.println("constructor1");
    }
    public MyInitTest(int n) {
        this();
        System.out.println("constructor" + n);
    }

    public static void main(String[] args) {
        MyInitTest mit = new MyInitTest(2);
    }
}
