package irina.labs.L_1_4;

/**
 * Created by epub on 3/5/2017.
 */
public class Lab_Work_1_4_4 {
    public static void main(String[] args) {
        int i = 1000;
        int c = 990;
        do {
            i++;
            c--;
            System.out.println(i);
            System.out.println(c);
        }
        while (i < 1010);
        while (c > 980) ;

        int a = 1;
        int v = -2;
        int b = (a++ + --v) + (a - ++v + 1);
        /*При использовании префиксной формы операнд модифицируется перед выполнением операции.
        В постфиксной форме сначала используется содержимое операнда,
        а лишь после этого операнд инкрементируется или декрементируется.
         */
        System.out.println(b);

    }
}
