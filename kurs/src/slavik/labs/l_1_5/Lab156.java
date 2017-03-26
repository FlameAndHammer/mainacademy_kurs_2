package slavik.labs.l_1_5;
import java.util.Scanner;
public class Lab156 {
    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner param = new Scanner(System.in);
        int x = param.nextInt();
        int sum = 0;
        // k2 = 2 (1 + 2 + 3 + ... + (param2=k – 1)) + k
        for (int i=1 ; i<x; i++)
            sum = sum + i;
        System.out.println("Solution answer: " + (2*sum+x));
    }
}
