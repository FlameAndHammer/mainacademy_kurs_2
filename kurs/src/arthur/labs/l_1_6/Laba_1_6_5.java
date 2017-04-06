package arthur.labs.l_1_6;

/**
 * Created by Arthur on 07.03.2017.
 * Write a program, which transpose matrix (2d arrays, size 4x4)
 * and outputs it to the console,
 * try to use only one array
 */
public class Laba_1_6_5 {
    public static void main(String[] args) {
        // The Matrix
        int [][] marr1 = {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
        System.out.println("It was:");
        for (int i=0; i<=3; i++) {
            for (int cells : marr1[i]) System.out.print("\t" + cells);
            System.out.println( "\n" );
        }
        // The Matrix Reloaded
        int buffer;
        for (int i=0; i<=3; i++){
            for (int j=i; j<=3; j++){
                buffer = marr1 [i][j];
                marr1 [i][j] =  marr1[j][i];
                marr1[j][i] = buffer;
            }
        }
        // The Matrix Revolutions
        System.out.println("It became: ");
        for (int i=0; i<=3; i++) {
            for (int cells : marr1[i]) System.out.print("\t" + cells);
            System.out.println("\n");

        }
    }
}
