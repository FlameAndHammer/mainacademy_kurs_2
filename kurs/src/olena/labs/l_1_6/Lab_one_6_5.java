package olena.labs.l_1_6;

import java.util.Arrays;
/**
 * Created by elenafostachuk on 3/12/17.
 */
public class Lab_one_6_5 {
    public static void main(String[] args) {
        int[][] marr1 = new int[4][4];
        for (int i = 1; i < marr1.length; i++) {
            for (int j = 0; j < marr1[i].length; j++)
                marr1[i][j] = 2*j + i;

        }
    
        System.out.println(Arrays.toString(marr1));


    }
}







