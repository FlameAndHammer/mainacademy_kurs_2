package arthur.labs.l_1_6;

/**
 * Created by Arthur on 07.03.2017.
 * Write a program, which creates square matrix like those in the figure below
 * and prints them formatted to the console. The size of the matrix is 4 x 4:
 *
 1 5 9  13
 2 6 10 14
 3 7 11 15
 4 8 12 16
 */
public class Laba_1_6_3 {
    public static void main(String[] args) {
        System.out.println();
        int [][] marr = {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
        for (int i=0; i<=3; i++) {
            for (int cells : marr[i]) System.out.print("\t" + cells);
            System.out.println( "\n" );
        }
    }
}
