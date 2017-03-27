package slavik.labs.l_1_5;
import java.util.Scanner;
public class Lab157 {
    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner param = new Scanner(System.in);
        int n = param.nextInt();
        int s;
        for (int i = 0; i < n; n--) {
            s = 0;
            for (int j = 1; j < n; j++)
                if (n % j == 0) s += j;
            if (n == s)System.out.println( n );
        }
    }
}
