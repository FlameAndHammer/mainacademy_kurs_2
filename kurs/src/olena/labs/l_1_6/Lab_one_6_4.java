package olena.labs.l_1_6;

import java.util.Arrays ;
/**
 * Created by elenafostachuk on 3/12/17.
 */
public class Lab_one_6_4 {
    public static void main(String[] args){
        int[] a = {22,65,47,72, 777, 80, 2,9};
        Arrays.sort(a);
        int searchVal = 777;
        int retVal = Arrays.binarySearch(a, searchVal);

        System.out.println("index is:" +  " " + retVal);
    }
}
