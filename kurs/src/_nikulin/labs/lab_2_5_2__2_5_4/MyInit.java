package _nikulin.labs.lab_2_5_2__2_5_4;

import java.util.Arrays;
import java.util.Random;

public class MyInit {
        // lab 2_5_2
//    private int[] arr;
//    {
//        arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (100 * Math.random());
//        }
//    }
    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

        // lab 2_5_3
    private static int[] arr;
        // lab 2_5_4
    static {
        arr = new int[10];
            Random random = new Random();
        for (int i=0; i<arr.length; i++)
            arr[i] = random.nextInt(100);
    }
}
