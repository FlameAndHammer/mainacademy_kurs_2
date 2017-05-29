package _nikulin.labs.lab_2_9_1;

public class Main {

    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println("Index of first occurrence 'ra' -> " + myStr.indexOf("ra"));
        System.out.println("Index of last occurrence 'ra' -> " + myStr.lastIndexOf("ra"));
        System.out.println("Substring of 3 to 7 -> " + myStr.substring(3, 7));
        System.out.println("Reverse of string '" + myStr + "' -> " + reverseString(myStr));
    }

    public static String reverseString(String str) {
        StringBuilder newStr = new StringBuilder(str);
        newStr.reverse();
        return newStr.toString();
    }
}
