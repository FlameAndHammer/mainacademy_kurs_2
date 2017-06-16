package yuriy.labs.labs_2.labs_2_10_.l_2_13.l_2_13_1.TestEnum1;

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
        for (MyDayOfWeek dir : MyDayOfWeek.values())
        {
            System.out.println(dir);
        }

    }
}
