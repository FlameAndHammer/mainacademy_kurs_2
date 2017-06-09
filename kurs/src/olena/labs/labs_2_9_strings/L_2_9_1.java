package olena.labs.labs_2_9_strings;

/**
 * Created by elenafostachuk on 5/26/17.
 */
public class L_2_9_1 {
    public static void main(String[] args){
        String myString = "abracadabra";
        System.out.println(myString.indexOf("ra"));
        System.out.println(myString.lastIndexOf("ra"));
        System.out.println(myString.substring(3,7));
        System.out.println(setString(myString));
    }
    public static String setString(String s){
        StringBuilder bui = new StringBuilder(s);
        String performed = bui.reverse().toString();
        return  performed;
    }
}
