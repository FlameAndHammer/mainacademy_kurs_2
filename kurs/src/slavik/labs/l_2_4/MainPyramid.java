package slavik.labs.l_2_4;
import java.util.Scanner;

public class MainPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        MyPyramid.printPiramid(scanner.nextInt());
    }
}