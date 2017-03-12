package artur.labs.l_1_6;

/**
 * Created by Arthur on 07.03.2017.
 * There are statistics for the year by months as an array:
 * int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 * Write code which calculates the maximum value from the array,
 * the minimum value and the average.
 */
public class Laba_1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int max = m[0], min = m[0], sum = 0 ;
        for (int cell : m){
         sum += cell;
         if (cell > max) max = cell;
         if (cell < min) min = cell;
        }
        System.out.println("maximum: " + max);
        System.out.println("minimum: " + min);
        System.out.println("average: " + sum / m.length);
    }
}
