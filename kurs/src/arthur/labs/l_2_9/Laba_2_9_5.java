package arthur.labs.l_2_9;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by arthk on 19.05.2017.
 * Create new project called TestRegExp. Add package “com.brainacad.oop.testsregexp”.
 * Create a class Main with a main() method. Create public static method
 * checkPersonWithRegExp(String userNameString) which take String as argument and
 * return boolean value. This method must return true only if argument string value begin
 * from Uppercase, then other chars in Lowercase and contains only letters.
 * In main() method declare array of String with next values: {“VOVA”,”Ivan”,”R2d2”,”ZX”,
 * ”Anna”,”12345”,”ToAd”,”TomCat”,” “} Add code to check each of these values with
 * checkPersonWithRe
 */
public class Laba_2_9_5 {
    public static void main(String[] args) {
        String array [] = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (int i=0; i<array.length; i++)
            System.out.println(checkPersonWithRegExp(array[i]));
    }

    public static boolean checkPersonWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[A-Z][-a-z]+$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

}
