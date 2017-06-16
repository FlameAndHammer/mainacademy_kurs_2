package yuriy.labs.labs_2.labs_2_10_.l_2_12.l_2_12_4.TestNested1;

import java.util.Scanner;

/**
 * Created by Ruble on 13.06.2017.
 */
public class Main
{
    public static void main(String[] args)
    {


        MyPhone myPhone = new MyPhone();
        myPhone.swichOn();
        System.out.println("Make the choice of the subscriber: (1 to 10)");
        Scanner sc = new Scanner(System.in);
        int arg1 = sc.nextInt();
        myPhone.call(arg1);

    }

}
