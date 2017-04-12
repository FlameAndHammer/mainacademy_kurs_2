package olena.labs.L_2_4;
import java.util.Scanner;

/**
 * Created by elenafostachuk on 4/12/17.
 */
public class MainPyr {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number from 1 to 9: ");
    MyPyramyd.printPyramyd(sc.nextInt());
    }
}
