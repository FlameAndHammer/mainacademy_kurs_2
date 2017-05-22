package yuriy.labs.l_2_9.TestTokennizer;

import java.util.StringTokenizer;

/**
 * Created by Ruble on 21.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("LabWork_2_9_4 by Yuriy Denezhko:\n");
        String myStr = "This is String, split by StringTokenizer. Created by Student: Yuriy Denezhko";
        System.out.println(myStr);
        System.out.println ("----------------------------------------------------------" + "\n" + "StringTokenizer “space”:");
        StringTokenizer myStr1 = new StringTokenizer(myStr);
        while (myStr1.hasMoreElements()){
            System.out.println(myStr1.nextElement());
        }
        System.out.println ("----------------------------------------------------------" + "\n" + "StringTokenizer “comma”:");
        StringTokenizer myStr2 = new StringTokenizer(myStr, ",");
        while (myStr2.hasMoreElements()){
            System.out.println(myStr2.nextElement());
        }
        System.out.println ("----------------------------------------------------------" + "\n" + "StringTokenizer “dot”:");
        StringTokenizer myStr3 = new StringTokenizer(myStr, ".");
        while (myStr3.hasMoreElements()){
            System.out.println(myStr3.nextElement());
        }

    }
}
