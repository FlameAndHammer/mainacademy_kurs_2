package olena.labs.l_1_6;

/**
 * Created by elenafostachuk on 3/12/17.
 */
public class Lab_one_6_2 {
    public static void main(String[] args) {
        int[] a = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
      int min = a[0];
      int max = a[0];
      int avg = a[0];
      for(int i =0; i < a.length; i++){
          if(max < a[i])
              max = a[i];
          if(min > a[i])
              min = a[i];
          if (avg > min | avg < max)
              avg = a[i];
      }
      System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println("Avg:" + avg);
      }
    }




