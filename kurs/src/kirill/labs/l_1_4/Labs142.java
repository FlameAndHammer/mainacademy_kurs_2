package kirill.labs.l_1_4;

/**
 * Created by Storm on 27.02.2017.
 */
public class Labs142 {
    public static void main(String[] arg) {
        int a = 45;
        int b = 5;
        float c = 3.34F;
        int z = 6;

        System.out.println("Значение переменной a  " + a);
        System.out.println("Значение переменной b  " + b);
        System.out.println("Значение переменной c  " + c);

        //arithmetic operations +
        int d = a+b;
        float e = b+c;

        System.out.println("Сумма a+b  " + d);
        System.out.println("Сумма b+c  " + e);

        //arithmetic operations -
        int f= a-b;
        float j= b-c;

        System.out.println("Разница a-b  " + f);
        System.out.println("Разница b-c  " + j);

        //arithmetic operations /
        int i = a/b;
        float k = b/c;

        System.out.println("Деление a/b  " + i);
        System.out.println("Деление b/c  " + k);

        //arithmetic operations *
        int o = a*b;
        float l = b*c;

        System.out.println("Умножение a*b  " + o);
        System.out.println("Умножение b*c  " + l);

        //arithmetic operations %
        int w = a%z;
        float s = b%c;

        System.out.println("Модуль a%z  " + w);
        System.out.println("Модуль b%c  " + s);
    }
}
