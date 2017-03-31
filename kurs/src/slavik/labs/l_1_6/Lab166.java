package slavik.labs.l_1_6;
import java.util.Arrays;
import java.util.Scanner;
public class Lab166 {
    public static void main(String[] args) {
        Scanner param = new Scanner(System.in);
        System.out.println("Enter length array:");
        int lengthArr = param.nextInt();
        int[] arr = new int[lengthArr];
        System.out.println("Enter number:");
        for (int i = 0; i < lengthArr; i++) {
            arr[i] = param.nextInt();
        }
        System.out.println("Old array:");
        for (int done : arr) {
            System.out.println(done);
        }
        Arrays.sort(arr,0,lengthArr);
        System.out.println();
        System.out.println("New array:");
        for (int done:arr) {
            System.out.println(Arrays.toString(new int[]{done}));
        }
    }
}