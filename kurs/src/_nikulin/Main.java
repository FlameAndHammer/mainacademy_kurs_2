package _nikulin;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by nikulin on 3/3/2017.
 */
public class Main
{
  public static void main(String[] args)
  {
    String number = "693534239A";
    int[] array = number.chars().map(n -> n - '0').toArray();
    System.out.println(Arrays.toString(array));

    char ch = '3';
    ch -= '0';
    System.out.println(ch);
    char ch1 = '';
    System.out.println((int)ch1);
    int ch2 = '3';
    ch2 -= '0';
    System.out.println(ch2);

    Integer[] arr = {11,22};
    Arrays.stream(arr).map(n -> null).collect(Collectors.toList()).forEach(n -> System.out.println("hello" + n));
  }
}
