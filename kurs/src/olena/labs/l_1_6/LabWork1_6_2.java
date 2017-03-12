package olena.labs.l_1_6;

/**
 * Created by Ruble on 09.03.2017.
 */

/*
There are statistics for the year by months as an array:
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Write code which calculates the maximum value from the array, the minimum value
        and the average.
*/

public class LabWork1_6_2 {
    public static void main(String[] args) {
        System.out.println("LabWork1_6_2 by Yuriy Denezhko:");
        System.out.println();
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int max = m[0];
        int min = m[0];
        int average = 0;

        for (int i = 0; i < m.length; i++){


            //System.out.println(m[i]);

            if (m[i] > max){
                max = m[i];
            }

            if (m[i] < min){
                min = m[i];
            }
            average = average + m[i];
        }

        average = average / m.length;
        System.out.println("maximum of array =\t" + max);
        System.out.println("minimum of array =\t" + min);
        System.out.println("average of array =\t" + average);

    }
}
