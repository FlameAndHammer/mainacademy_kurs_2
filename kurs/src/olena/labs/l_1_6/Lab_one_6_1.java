package olena.labs.l_1_6;

/**
 * Created by elenafostachuk on 3/12/17.
 */
public class Lab_one_6_1 {
    public static void main(String[] args){
        int[] arr1 = new int[15];
        int i = 0;
        int b = 2;
        while(i < arr1.length) {
            arr1[i] = b;
            b+= 2;
            i++;
        }
        for(i =0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
    }
}
