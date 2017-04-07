package olena.labs.L_2_4;

/**
 * Created by elenafostachuk on 4/7/17.
 */
public class Calculation {
   public static void main(String[] args){
       int []arr1 = {3,2,3,4,4,8,10, -1};
       int [] arr2 = {5,7,4,12,16,17, -4};

       MyMath findNumber = new MyMath();

       findNumber.findMin(arr1);
       findNumber.findMax(arr1);
       findNumber.findMax(arr2);
       findNumber.findMin(arr2);

       double radius = 31;

       findNumber.AreaOfCircle(radius);
    }
}
