package arthur.additional;

/**
 * Created by Arthur on 13.04.2017.
 */
public class Fibo3 {
    static int fibo (int n){
        if (n<0) return 0;

        if (n==0) return 0;
        if (n==1) return 1;
        else return fibo(n-2) + fibo(n-1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
    }
}
