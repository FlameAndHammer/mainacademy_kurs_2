package _nikulin.reflection;

public class ReflectionTest {

    private final int a;
    protected String str;
    private final Double d;

    public ReflectionTest(int a, String str, Double d) {
        this.a = a;
        this.str = str;
        this.d = d;
    }

    public ReflectionTest() {
        a = 14;
        d = 5.0;
    }
}
