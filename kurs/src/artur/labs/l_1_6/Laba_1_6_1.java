
package artur.labs.l_1_6;
/**
 * Created by Arthur on 07.03.2017.
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30)
 * and display elements of the array to the screen.
 */

public class Laba_1_6_1 {
    public static void main(String[] args) {
        int [] array = new int [15];
        for (int i=1; i<=15; i++) array [i-1] = i * 2 ;
        for (int cell : array ) System.out.print(cell + " ");
    }
}

