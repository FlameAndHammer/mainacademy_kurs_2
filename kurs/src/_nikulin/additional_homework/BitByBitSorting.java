package _nikulin.additional_homework;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nikulin on 3/17/2017.
 */
public class BitByBitSorting
{
  public static void main(String[] args)
  {
    int[] arr = {324, 443, 564, 23, 1111, 111};

    int maxRank = 5;

    int length = arr.length;

    for (int i = 0; i < maxRank; i++) {

      int[] sortArr = new int[10];

      for (int j = 0; j < length; j++) {
        sortArr[dig256(arr[j], i)]++;
      }

      for (int j = 1; j < 10; j++) {
        sortArr[j] += sortArr[j - 1];
      }

      int[] tempArr = new int[length];
      for (int j = length - 1; j >= 0; j--) {
        tempArr[--sortArr[dig256(arr[j], i)]] = arr[j];
      }
      arr = tempArr;
    }
    System.out.print(Arrays.toString(arr));
  }
  public static int dig256(int n, int p)
  {
    return n /((int) Math.pow(10,p)) % 10;
  }
}
