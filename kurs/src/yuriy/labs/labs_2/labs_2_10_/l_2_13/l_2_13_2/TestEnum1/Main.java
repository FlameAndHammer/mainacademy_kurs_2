package yuriy.labs.labs_2.labs_2_10_.l_2_13.l_2_13_2.TestEnum1;

import java.util.Scanner;

/**
 * Created by Ruble on 15.06.2017.
 */
public class Main
{
    enum MyDayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args)
    {
        /*for (MyDayOfWeek dir : MyDayOfWeek.values())
        {
            System.out.println(dir);
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days per week are devoted to java classes?");
        int daysClassesSizeOfArray = sc.nextInt();
        int[] daysClassesArray = new int[daysClassesSizeOfArray];


        System.out.println("What days do you have java classes?");
        for (int i = 0; i < daysClassesSizeOfArray; i++)
        {
            daysClassesArray[i] =  sc.nextInt();

        }
        for (int i : daysClassesArray)
        {
            System.out.print("My Java day: ");
            switch (i)
            {
                case 0: {System.out.println(MyDayOfWeek.SUNDAY); break;}
                case 1: {System.out.println(MyDayOfWeek.MONDAY); break;}
                case 2: {System.out.println(MyDayOfWeek.TUESDAY); break;}
                case 3: {System.out.println(MyDayOfWeek.WEDNESDAY); break;}
                case 4: {System.out.println(MyDayOfWeek.THURSDAY); break;}
                case 5: {System.out.println(MyDayOfWeek.FRIDAY); break;}
                case 6: {System.out.println(MyDayOfWeek.SATURDAY); break;}
                default:{System.out.println("All week"); break;}
            }
        }

    }
}
