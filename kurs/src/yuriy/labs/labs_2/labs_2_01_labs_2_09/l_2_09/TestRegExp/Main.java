package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_09.TestRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ruble on 21.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_9_5 by Yuriy Denezhko:\n");
        String [] array = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (String str : array) {
            System.out.println(str + ": " + checkPersonWithRegExp(str));
        }

    }
    public static boolean checkPersonWithRegExp(String userNameString){
        String regexp = "^[A-Z][a-z]+$";
        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(userNameString);
        return  m.matches();
    }
}
