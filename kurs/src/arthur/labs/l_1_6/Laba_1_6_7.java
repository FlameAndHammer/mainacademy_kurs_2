package arthur.labs.l_1_6;

/**
 * Created by Arthur on 08.03.2017.
 * Write a program, which finds in a given matrix the area of equal numbers.
 * Here is one example with an area containing 7 elements with equal value of 1:
 * 1 1 1 3 4
 * 2 1 3 1 2
 * 2 2 3 4 1
 * 3 3 3 1 4
 * The program must print to console:
 * Line 1: [0-2]
 * Line 2: [1,3]
 * Line 3: [4]
 * Line 4: [3]
 */
public class Laba_1_6_7 {
    public static void main(String[] args) {
        System.out.println("\n");
        int marr [][] = {{1,1,1,3,4},{2,1,3,1,2},{2,2,3,4,1},{3,3,3,1,4}};
        for (int i=0; i<=3; i++) {
            System.out.print("Line " + (i+1) + ": [");
            for (int j=0; j<=4; j++) {
                if (marr[i][j] == 1) {
                    System.out.print(j + ",");
                }
            }
            System.out.println("]"); // I have a feeling that there is a simple system way to output "[0-2]"
        }
    }
}
