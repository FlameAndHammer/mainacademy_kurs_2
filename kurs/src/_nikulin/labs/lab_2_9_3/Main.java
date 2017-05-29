package _nikulin.labs.lab_2_9_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String valueString = "Using methods of class String";
        System.out.println("Array unique symbol string {" + valueString + "} -> " +
                Arrays.toString(uniqueChars(valueString)));
    }

    public static char[] uniqueChars(String s) {
        StringBuilder uniqueChar = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if (s.indexOf(current) == s.lastIndexOf(current)) {
                uniqueChar.append(current);
            }
        }
        return uniqueChar.toString().toCharArray();
    }
}
