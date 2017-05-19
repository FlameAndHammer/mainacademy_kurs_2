package arthur.labs.l_2_9;

/**
 * Created by arthk on 18.05.2017.
 * Create new project called TestStrings3.
 * Add package “com.brainacad.oop.teststring3”.
 * Create a class Main with a main() method. Create static method:
 * uniqueChars(String s), which must take a String as argument and
 * return an array of distinct (unique) chars (char[]) of the given string.
 * In method main() add code to invoke uniqueChars() method and pass string:
 * “Using methods of class String” as argument. Print result to console.
 * Execute the program.
 */

public class Laba_2_9_3 {
    public static void main(String[] args) {
        String example = "Using methods of class String";
        System.out.println(uniqueChars(example));
    }

    public static String uniqueChars(String s) {
        StringBuffer outcome = new StringBuffer(s.length());
        for (int i=0; i < s.length(); i++ ){
            if (outcome.toString().indexOf(s.charAt(i)) == -1)
                outcome.append(s.charAt(i));
        }
        return outcome.toString();
    }
}
