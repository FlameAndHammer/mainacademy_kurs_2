package slavik.labs.l_1_5;
import java.util.Scanner;
public class Lab155 {
    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner param = new Scanner(System.in);
        int x = param.nextInt();
        int sum = 0;
        int avg = 0;
        for (int i=1 ; i<=x; i++) {
            sum = sum + x;
            avg = sum/i;
        }
        System.out.println("The Sum is:" + sum);
        System.out.println("The Avg is:" + avg);
    }
}
