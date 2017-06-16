package yuriy.labs.labs_2.labs_2_10_.l_2_13.l_2_13_3.TestEnum1;

import java.util.Scanner;

/**
 * Created by Ruble on 15.06.2017.
 */
public class Main
{
    public enum MyDayOfWeek {

        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

       /* SUNDAY {public MyDayOfWeek nextDay() { return MONDAY; }},
        MONDAY {public MyDayOfWeek nextDay() { return TUESDAY; }},
        TUESDAY {public MyDayOfWeek nextDay() { return WEDNESDAY; }},
        WEDNESDAY {public MyDayOfWeek nextDay() { return THURSDAY; }},
        THURSDAY {public MyDayOfWeek nextDay() { return FRIDAY; }},
        FRIDAY {public MyDayOfWeek nextDay() { return SATURDAY; }},
        SATURDAY {public MyDayOfWeek nextDay() { return SUNDAY; }}*/
       public void nextDay(MyDayOfWeek day)
       {
           switch (day)
           {
               case SATURDAY: {System.out.println(MyDayOfWeek.SUNDAY); break;}
               case SUNDAY: {System.out.println(MyDayOfWeek.MONDAY); break;}
               case MONDAY: {System.out.println(MyDayOfWeek.TUESDAY); break;}
               case TUESDAY: {System.out.println(MyDayOfWeek.WEDNESDAY); break;}
               case WEDNESDAY: {System.out.println(MyDayOfWeek.THURSDAY); break;}
               case THURSDAY: {System.out.println(MyDayOfWeek.FRIDAY); break;}
               case FRIDAY: {System.out.println(MyDayOfWeek.SATURDAY); break;}
               default:{System.out.println("Not MyDayOfWeek!"); break;}
           }
       }


    }
    public static void main(String[] args)
    {
        System.out.println("The Enums of MyDayOfWeek: ");
        for (MyDayOfWeek dir : MyDayOfWeek.values())
        {
            System.out.println(dir);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the day:");
        String day = sc.nextLine();



        System.out.print("The next day of week: ");
                 MyDayOfWeek.FRIDAY.nextDay( MyDayOfWeek.valueOf(day));



    }
}
