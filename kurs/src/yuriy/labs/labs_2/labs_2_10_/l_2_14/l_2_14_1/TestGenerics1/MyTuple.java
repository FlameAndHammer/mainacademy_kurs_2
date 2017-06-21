package yuriy.labs.labs_2.labs_2_10_.l_2_14.l_2_14_1.TestGenerics1;

/**
 * Created by Ruble on 20.06.2017.
 */
public class MyTuple<A,B,C>
{
    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
