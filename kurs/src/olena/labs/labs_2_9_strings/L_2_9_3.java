package olena.labs.labs_2_9_strings;

import java.util.Arrays;
/**
 * Created by elenafostachuk on 5/26/17.
 */
public class L_2_9_3 {
    public static void main(String[] args) {
        String valueString = "Using methods od class String";
        System.out.println ("Array of the unique symbols {" +  valueString + "} :" + Arrays.toString(uniqueChars(valueString)));
    }

    public static char[] uniqueChars(String s) {
        StringBuilder uniqueChar = new StringBuilder();
        for (int i=0; i < s.length(); i++ ){
            if (uniqueChar.toString().indexOf(s.charAt(i)) == -1)
                uniqueChar.append(s.charAt(i));
        }
        return uniqueChar.toString().toCharArray();
    }
}
