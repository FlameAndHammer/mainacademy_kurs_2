package olena.labs.l_1_6;

import java.util.Arrays;

/*
 CCreated by elenafostachuk on 3/12/17.
 */
public class Lab_0ne_6_6
{
    public static void main(String[] args) {
        int[] stat = {-5, -7, 0, 6, 12, 17, 23, 27, 16, 7, 2, -3};

        int[] plusStat = new int[stat.length];
        int[] minusStat = new int[stat.length];


        int plusIndex = 0;
        int minusIndex = 0;
        for (int i = 0; i < stat.length; i++) {
            if (stat[i] > 0)
                plusStat[plusIndex++] = stat[i];
            if (stat[i] < 0)
                minusStat[minusIndex++] = stat[i];
        }


        int plusNumber = 0;
        int minusNumber = 0;

        for (int i = 0; i < stat.length; i++) {
            if (plusStat[i] > 0)
                plusNumber++;
            if (minusStat[i] < 0)
                minusNumber++;
        }



        System.out.println(Arrays.toString(minusStat));
        System.out.println(Arrays.toString(plusStat));
    }
}

