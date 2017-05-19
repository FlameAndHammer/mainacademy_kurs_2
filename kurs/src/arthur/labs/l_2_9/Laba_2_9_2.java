package arthur.labs.l_2_9;

/**
 * Created by arthk on 18.05.2017.
 * Create new project called TestStrings2. Add package “com.brainacad.oop.teststring2”.
 * Create a class Main with a main() method. In method main() declare two local variables myStr1
 * and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.
 * Write code to display all of the letters, which are present in the first word,
 * but absent in the second.
 */
public class Laba_2_9_2 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        String str1 = myStr1.toUpperCase();
        String str2 = myStr2.toUpperCase();
        StringBuffer result = new StringBuffer("");

        if (myStr1.length() > myStr2.length()) result.setLength(myStr1.length());
        else result.setLength(myStr2.length()) ;

        for (int i=0; i < str1.length(); i++ ){
            if (str2.indexOf(str1.charAt(i) ) == -1 ) result.append(myStr1.charAt(i));
        }
        System.out.println(result);


    }
}
