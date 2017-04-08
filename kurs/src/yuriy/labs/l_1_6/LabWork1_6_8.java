package yuriy.labs.l_1_6;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ruble on 17.03.2017.
 *
 * Дан целочисленный массив. Выполнить проверку уникальности элементов.
 * Удалить из массива повторные вхождения чисел, предварительно отсортировав данные
 *
 *
 */
public class LabWork1_6_8 {

    public static void main(String[] args) {

        System.out.println("LabWork1_6_8 by Yuriy Denezhko:");
        System.out.println();

        System.out.println("Enter the length of array:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("Enter the maxRank:");
        int maxRank = sc.nextInt();

        // Greate, fill and print the array:

        int[] array = new int[length];
        int[] array1 = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (Math.pow(10, maxRank)));
            System.out.print("\t" + array[i]);
        }
        System.out.println();
        array1 [length] = bitByBitSorting (array,length,maxRank);
        System.out.print(Arrays.toString(array));


    }
    public static int bitByBitSorting (int[] array, int length, int maxRank){
        //BitByBitSorting
        for (int i = 0; i < maxRank; i++) {
            int t = 10;

            int[] sortArr = new int[t];

            for (int j = 0; j < length; j++) {
                sortArr[dig256(array[j], i)]++;
            }

            for (int j = 1; j < 10-1; j++) {
                sortArr[j] += sortArr[j - 1];
            }

            int[] tempArr = new int[length];
            for (int j = length - 1; j >= 0; j--) {
                tempArr[--sortArr[dig256(array[j], i)]] = array[j];
            }
            array = tempArr;
        }
        return array[length];
        //System.out.print(Arrays.toString(array));
    }
    public static int dig256(int n, int p)
    {
        return n /((int) Math.pow(10,p)) % 10;
    }
}
