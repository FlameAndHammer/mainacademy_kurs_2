package olena.labs.L_2_5_1;

/**
 * Created by elenafostachuk on 4/14/17.
 */
public class MyInit {
    static {
        System.out.println("Static initialization block 1");
    }
    {
        System.out.println("Non-static initialization block 1");
    }
    public MyInit(int identiNumber){
        System.out.println("Constructor with parameter");
    }
    {
        System.out.println("Non-static initialization block 2");
    }

    public MyInit() {
        this(0);
        System.out.println("Constructor 1");

    }
    static{
        System.out.println("Static initialization block 2");
    }
}
