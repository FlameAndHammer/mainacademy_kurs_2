package slavik.labs.l_2_5;

import java.util.Arrays;

public class MyInit {
     private static  int[] arr;
      static {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
 }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
}
