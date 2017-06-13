package yuriy.labs.labs_2.labs_2_01_labs_2_09.l_2_09.TestStrings1;

/**
 * Created by Ruble on 20.05.2017.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("LabWork_2_9_1 by Yuriy Denezhko:\n");
        String myStr = "abracadabra";

        System.out.println("myStr = " + "\"" + myStr + "\"");
        System.out.println("The index of first “ra” substring of myStr value -> " + "\t" + myStr.indexOf("ra") + ";");
        System.out.println("The index of last  “ra” substring of myStr value -> " + "\t" + myStr.lastIndexOf("ra") + ";");
        System.out.println("The substring of myStr from 3 to 7 char index ->  " + "\t" + myStr.substring(3,7) + ";");
        System.out.println("The reverseString of myStr   ->  " + "\t" + reverseString(myStr) + ".");
    }

    public static String reverseString (String str){
        char[] charArray = new char[str.length()];
        for (int i = 0; i < charArray.length; i++){
            charArray [i] = str.charAt(str.length() - 1 - i);
        }
        String ResultStr = new String(charArray);
        return ResultStr;
    }
}
