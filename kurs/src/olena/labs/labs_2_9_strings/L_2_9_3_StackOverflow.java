package olena.labs.labs_2_9_strings;

/**
 * Created by elenafostachuk on 5/28/17.
 */
public class L_2_9_3_StackOverflow {

    public static boolean checkForUnique(String str) {
        boolean containsUnique = false;

        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                containsUnique = true;
            } else {
                containsUnique = false;
            }
        }

        return containsUnique;
    }

    public static void main(String[] args) {
        String myStr = new String("King Lear");
        System.out.println(checkForUnique(myStr));

    }
}
