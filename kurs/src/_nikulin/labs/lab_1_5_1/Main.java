package _nikulin.labs.lab_1_5_1;

public class Main {

    public static void main(String[] args) {
        int numberLine = 1;
        while (numberLine <= 8) {
            int value = numberLine;
            while (value >= 1) {
                System.out.print(value + " ");
                value--;
            }
            System.out.println();
            numberLine++;
        }
    }
}
