package slavik.labs.l_1_6;
import java.util.Arrays;
import java.util.Scanner;
public class Lab164 {
    public static void main(String[] args) {
        System.out.println("Enter length array:");
        Scanner param = new Scanner(System.in);
        int length = param.nextInt();
        int array[] = new int[length];
        System.out.println("Enter number:");
        for (int i = 0; i < length; i++) {
            array[i] = param.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Enter find number:");
        int findNumber = param.nextInt();
        int otvet = Arrays.binarySearch(array, findNumber);
        if (otvet < 0) System.out.println("No such number!!!");
        else {
            for (int m : array)
                System.out.print(m + " ");
            System.out.println();
            System.out.println("The desired number has an index (starting from zero):" + otvet);
        }
    }
  }


