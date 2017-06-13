package yuriy.labs.labs_1.l_1_6;

import java.util.Arrays;

/**
 * Created by Ruble on 11.03.2017.
 */
/*

Write a program that sorts an array of average temperature values by months of 2015
        as follows: at first the negative values, then - positive values
*/

public class LabWork1_6_6 {
    public static void main(String[] args) {

        System.out.println("LabWork1_6_6 by Yuriy Denezhko:");
        System.out.println();
        double[] averageTemperatureValuesByMonths = {-5.3, -4.9,-0.1, 6.7, 12.6, 15.7, 17.7, 16.4, 12.3, 6.3, 1.8, -2.3};

        Arrays.sort(averageTemperatureValuesByMonths);
        System.out.println(Arrays.toString(averageTemperatureValuesByMonths));
    }
}
