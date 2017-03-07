package _nikulin.labs.lab_1_5_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("* | 1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("--------------------------------------");
        for(int i=1; i<=9; i++) {
            System.out.print(i + " | ");
            for (int j=1; j<=9; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
