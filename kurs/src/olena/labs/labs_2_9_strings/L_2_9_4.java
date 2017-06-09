package olena.labs.labs_2_9_strings;

import java.util.StringTokenizer;

/**
 * Created by elenafostachuk on 5/26/17.
 */
public class L_2_9_4 {
    public static void main(String[] args) {
        String myStr = "ThisisString,splitbyStringTokenizer!CreatedbyStudent:ElenaTheStupid.";

        StringTokenizer st = new StringTokenizer(myStr, ", .! :");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
