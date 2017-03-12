package olena.labs.l_1_5;

/**
 * Created by elenafostachuk on 3/9/17.
 */
public class LabOneFiveOne
{
    public static void main(String[] args) {
        String previousLine = " ";
        for (int i = 1; i < 9; i++) {
            previousLine = i + " " + previousLine;
            System.out.print(previousLine);
            System.out.println();
        }
    }

}
