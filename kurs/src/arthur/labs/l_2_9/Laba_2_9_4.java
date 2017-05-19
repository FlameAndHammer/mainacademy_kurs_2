package arthur.labs.l_2_9;
import java.util.StringTokenizer;


/**
 * Created by arthk on 19.05.2017.
 * Create new project called TestTokennizer. Add package “com.brainacad.oop.teststokennizer”.
 * Create a class Main with a main() method. In method main() declare local variables myStr add
 * code which split a string by “space” “comma” and “.dot” delimiter using StringTokennizer class,
 * and iterate the StringTokenizer elements and print it out one by one to console. String myStr =
 * “This is String, split by StringTokenizer. Created by Student:Name of Student”. Execute the program.
 */

public class Laba_2_9_4 {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";

        StringTokenizer st = new StringTokenizer(myStr,", .");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
