package _nikulin.labs.lab_2_9_2;

public class Main {
    public static void main(String[] args) {
        String myStr_1 = "Cartoon",
               myStr_2 = "Tomcat";
        printLetters(myStr_1, myStr_2);
    }

    public static void printLetters(String str_1, String str_2) {
        System.out.print("The unique character of the first string: ");
        for(int i=0; i<str_1.length(); i++) {
            char ch = str_1.charAt(i);
            if (str_2.indexOf(ch) == -1) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
    }
}
