package yuriy.labs.l_2_04;

import yuriy.labs.l_1_6.LabWork1_6_8;

/**
 * Created by Ruble on 05.04.2017.
 */
/*

Lab Work 2-4-1
        Create class MyMath with two static methods (findMin and findMax), which will take
        array of int values as argument and return minimum element value (for findMin
        method) or maximum element value (for findMax method).

Lab Work 2-4-3
        Add to class MyMath final static field PI = 3.14 and static method areaOfCircle(), which
        will take radius, use constant PI and calculate area.
*/

public class MyMath {

    final static double PI = 3.14;

    public static int findMin1 (int[] array){
        int minimum = array [0];
        for (int i = 1; i < array.length; i++){
            if (minimum > array[i]){minimum = array[i];}
        }
        return minimum;}

    public static int findMax1 (int[] array){
        int maximum = array [0];
        for (int i = 1; i < array.length; i++){
            if (maximum < array[i]){maximum = array[i];}
        }
        return maximum;}

    public static int findMin2 (int[] array){
        array [array.length]  =  LabWork1_6_8.bitByBitSorting(array, array.length, 4);
        int minimum = array [0];
        return minimum;
    }

    public static int findMax2 (int[] array){
        array [array.length]  =  LabWork1_6_8.bitByBitSorting(array, array.length, 4);
        int maximum = array [array.length];
        return maximum;
    }


    public static double areaOfCircle(double radius){
        double area = radius * radius * PI;
        return area;}


}
