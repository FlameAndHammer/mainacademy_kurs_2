package dana.labs.l_1_5;
import java.util.Scanner;
/**
 * Created by 123 on 06.03.2017.
 */
public class myLab152 {
    public static void main(String[] args) {
        System.out.println("enter number x:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        String line;
        if (x > 1 && x < 9) {
            switch (x) {
                case 1:
                    line = "One";
                    System.out.println(x);
                    break;
                case 2:
                    line = "two";
                    System.out.println(x);
                    break;
                case 3:
                    line = "three";
                    System.out.println(x);
                    break;
                case 4:
                    line = "four";
                    System.out.println(x);
                    break;

            }
        } else if (x > 9) {
            System.out.println("other");
        } else {
            System.out.println("error");
        }
    }
}
