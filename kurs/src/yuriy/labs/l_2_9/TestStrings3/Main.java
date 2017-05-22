package yuriy.labs.l_2_9.TestStrings3;

/**
 * Created by Ruble on 21.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_9_3 by Yuriy Denezhko:\n");

        System.out.println("argument -> " + "\"" + "Using methods of class String" + "\"");
        System.out.println("result -> " + "\"" + uniqueChars("Using methods of class String").toString() + "\"");
    }

    public static String uniqueChars (String str){

        String resultStr = new StringBuilder(str).reverse().toString();
        resultStr = resultStr.replaceAll("(.)(?=.*\\1)", "");
        resultStr = new StringBuilder(resultStr).reverse().toString();
        //String resultStr1 = resultStr.toString();
        //resultStr1 = resultStr;


       // char[] charArray;

      //  return resultStr1.toCharArray();
        return resultStr;

    }
}
