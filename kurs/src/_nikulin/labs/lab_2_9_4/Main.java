package _nikulin.labs.lab_2_9_4;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String myString = "This is String, split by StringTokenizer. Created by Student Ivan";
        StringTokenizer tokens = new StringTokenizer(myString, " ,.");
        System.out.println("Split string into tokens:");
        while (tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }
}
