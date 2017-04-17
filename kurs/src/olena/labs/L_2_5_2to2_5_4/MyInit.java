package olena.labs.L_2_5_2to2_5_4;
import java.util.Arrays;
import  java.util.Random;
/**
 * Created by elenafostachuk on 4/14/17.
 */
public class MyInit {
    private static int [] arr;
    static {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] =  (int) (100 * Math.random());
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
}





