package inna.labs.l_1_5;

/**
 * Created by ИННА on 12.03.2017.
 */
public class Lesson53 {
    public static void main(String[] args) {
        System.out.println ("*|\t1\t2\t3\t4\t5\t6\t7\t8\t9");
        System.out.println("-------------------------------------");
        for (int x = 1; x < 10; x++ ) {
            System.out.print(x+"|\t");
            for (int y = 1; y < 10; y++){
                System.out.print(x*y + "\t");
            }
            System.out.println("\t");
        }
    }
}
