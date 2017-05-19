package arthur.labs.l_2_9;

/**
 * Created by arthk on 18.05.2017.
 * Create new project called TestStrings1.
 * Add package “com.brainacad.oop.teststring1”.
 * Create a class Main with a main() method. In method main() declare local variable
 * myStr of String type and assign a value: “abracadabra”. Using the methods of the class String,
 * do next steps: * Find the index of first “ra” substring of myStr value and
 * print result to console. * Find the index of last “ra” substring of myStr value and
 * print result to console. * Get substring of myStr from 3 to 7 char
 * index and print result to console. * Create static method reverseString(String)
 * which return String value as result with changed order of letters (reverse it,
 * for example “abcd” ->”dcba”). * Invoke reverseString() method with myStr argument
 * and print result to console. Execute the program.
 */
public class Laba_2_9_1 {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3,7));
        System.out.println(reserveString(myStr));
    }

    public static String reserveString (String s) {
        StringBuffer buffer = new StringBuffer(s);
        String reversedStr = buffer.reverse().toString();
        return reversedStr;
    }
}
