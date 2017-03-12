package maksim.labs.l_1_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Пк on 07.03.2017.
 */
public class Lab1_6_6 {
    public static void main(String[] args) {
        System.out.println("Let's remember weather in 2015");
        int[] months = new int[12];
        String mo = "";
        for (int i = 0; i < 12; i++){
            int numberOfMonths = i + 1;
            switch (numberOfMonths){
                case 1: mo = "Jan";
                    break;
                case 2: mo = "Feb";
                    break;
                case 3: mo = "Mar";
                    break;
                case 4: mo = "Apr";
                    break;
                case 5: mo = "May";
                    break;
                case 6: mo = "Jun";
                    break;
                case 7: mo = "Jul";
                    break;
                case 8: mo = "Aug";
                    break;
                case 9: mo = "Sep";
                    break;
                case 10: mo = "Oct";
                    break;
                case 11: mo = "Nov";
                    break;
                case 12: mo = "Dec";
                    break;
            }
            System.out.println("Do you remember what was the temperature in " + mo + " 2015? " );
            Scanner sc = new Scanner(System.in);
            months[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Now let's look at temperature from the coldest to the hottest month:");
        Arrays.sort(months);
        System.out.println(Arrays.toString(months));
    }
}
