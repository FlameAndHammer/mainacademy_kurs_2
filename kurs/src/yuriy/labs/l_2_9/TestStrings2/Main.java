package yuriy.labs.l_2_9.TestStrings2;

/**
 * Created by Ruble on 20.05.2017.
 */
public class Main {
    public static void main(String[] args) {
    String myStr1 = "Cartoon";
    String myStr2 = "Tomcat";
        System.out.println("LabWork_2_9_2 by Yuriy Denezhko:\n");
        System.out.println("myStr1 = " + "\"" + myStr1 + "\"");
        System.out.println("myStr2 = " + "\"" + myStr2 + "\"");
        System.out.println("All of the letters, which are present in the first word, but absent in the second -> " + uniqueCharsString1 (myStr1,myStr2));
        System.out.println("All of the letters, which are present in the second word, but absent in the first -> " + uniqueCharsString1 (myStr2,myStr1));
}

    public static String uniqueCharsString1 (String str1, String str2){
        String str = "";
        for (int i = 0; i < str1.length(); i++){
            if (str2.indexOf(str1.charAt(i), i) < 0){
                str = str + str1.charAt(i);
            }
        }
        String resultStr = new StringBuilder(str).reverse().toString();
        resultStr = resultStr.replaceAll("(.)(?=.*\\1)", "");
        resultStr = new StringBuilder(resultStr).reverse().toString();

        return resultStr;
    }
}

