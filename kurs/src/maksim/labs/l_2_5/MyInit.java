package maksim.labs.l_2_5;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Пк on 06.04.2017.
 */
public class MyInit {
    static int[] arr = new int[10];
    {
        for (int i = 0; i < arr.length; i++){
            Random rnd = new Random();
            arr[i] = rnd.nextInt(89) + 10;
        }
    }

    public void printArray(int[] someArray){
        System.out.println(Arrays.toString(someArray));
    }

    public static void main(String[] args) {
        MyInit Array1 = new MyInit();
        Array1.printArray(arr);
        MyInit Array2 = new MyInit();
        Array2.printArray(arr);
        MyInit Array3 = new MyInit();
        Array3.printArray(arr);
    }
}
