package slavik.labs.l_2_4;
import java.util.Scanner;
public class Calculation {
    public static void main(String[] args) {
        Scanner param = new Scanner(System.in);
        System.out.println("Enter length 1 array:");
        int lengthArr_1 = param.nextInt();
        int[] arr_1 = new int[lengthArr_1];
        System.out.println("Enter number:");
        for (int i = 0; i < lengthArr_1; i++) {
            arr_1[i] = param.nextInt();
        }
        System.out.println("Enter length 2 array:");
        int lengthArr_2 = param.nextInt();
        int[] arr_2 = new int[lengthArr_2];
        System.out.println("Enter number:");
        for (int i = 0; i < lengthArr_2; i++) {
            arr_2[i] = param.nextInt();
        }
        System.out.println("Min №1: " + MyMath.findMin(arr_1));
        System.out.println("Min №2: " + MyMath.findMin(arr_2));
        System.out.println("Max №1: " + MyMath.findMax(arr_1));
        System.out.println("Max №2: " + MyMath.findMax(arr_2));
        System.out.println();
        System.out.println("Area circle: " + MyMath.areaOfCircle(5.9));
        }
    }
