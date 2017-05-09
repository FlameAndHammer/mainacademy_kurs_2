package slavik.labs.l_2_4;
import java.util.Scanner;
public class MainGravityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GravityCalculator obj = new GravityCalculator();
        System.out.print("Enter : ");
        System.out.println(obj.calcDist(scanner.nextInt()));
    }
}
