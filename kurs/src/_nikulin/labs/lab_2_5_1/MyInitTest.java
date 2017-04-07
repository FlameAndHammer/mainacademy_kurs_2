package _nikulin.labs.lab_2_5_1;

public class MyInitTest {

    static {
        System.out.println("Static initializstion block 1");
    }
    {
        System.out.println("Non-static initializstion block 1");
    }
    public MyInitTest(int identNumber) {
        System.out.println("Constructor with parameter");
    }
    {
        System.out.println("Non-static initializstion block 2");
    }
    public MyInitTest() {
        this(20151000);
        System.out.println("Constructor 1");
    }
    static {
        System.out.println("Static initializstion block 2");
    }

}
