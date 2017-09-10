package yuriy.labs.labs_3.l_05.LabWork1_5_1.TestRecflection1;

/**
 * Created by Ruble on 25.08.2017.
 */
final class MyClass
{
    private int a;
    int b;
    protected int c;
    public int d;

    public MyClass() {
    }

    public MyClass(int a) {
        this.a = a;
    }

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MyClass(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
