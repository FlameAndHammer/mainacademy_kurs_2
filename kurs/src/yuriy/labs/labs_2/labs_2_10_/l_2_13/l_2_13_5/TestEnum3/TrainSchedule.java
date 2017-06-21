package yuriy.labs.labs_2.labs_2_10_.l_2_13.l_2_13_5.TestEnum3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ruble on 16.06.2017.
 */
public class TrainSchedule
{
    public enum  DayOfWeek
    {
        SUNDAY (0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
        int value;
        DayOfWeek (int val){
            value = val;
        }
    };

    private Train [] trains = new Train [7];

    public TrainSchedule(Train[] trains)
    {
        this.trains = trains;
    }

    public Train addTrain()
    {
       /* 3) Add to class TrainSchedule public method addTrain() without parameters, which read
        from console (using System.in and Scanner) all information on train, then to create
        new Train object and pass it to next available array element.

        "Enter the number of trains in the schedule:"
        */

        Train addedTrain = new Train();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number of train - > ");
        addedTrain.number = sc.nextInt();

        System.out.println("Enter the station Dispatch -> ");
        addedTrain.stationDispatch = sc.nextLine();

        System.out.println("Enter the station Arrival -> ");
        addedTrain.stationArrival = sc.nextLine();

        System.out.println("Enter the time Dispatch -> ");
        addedTrain.timeDispatch = sc.nextLine();

        System.out.println("Enter the time Arrival -> ");
        addedTrain.timeArrival = sc.nextLine();

        System.out.println("Enter the days -> ");
        String days = sc.nextLine();
        String[] arrDays = days.split("[:,]");
        Integer [] intArrDays = new Integer[arrDays.length];
        for (int i = 0; i < arrDays.length; i++)
        {
            intArrDays[i] = Integer.parseInt(arrDays[0]);
        }

        for (int i = 0; i < intArrDays.length; i++)
        {
           // addedTrain.days;
        }


       /* addedTrain.days =  */

        return addedTrain;
    }



    class Train
    {
        int number;
        String stationDispatch; // станция отправка
        String stationArrival; // прибытие
        String timeDispatch;
        String timeArrival;
        DayOfWeek[] days;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        public void setDays(Integer [] intArrDays)
        {
            //this.days.length = intArrDays;
            for (int i = 0; i < intArrDays.length; i++)
            {
                // addedTrain.days;
            }

        }

        @Override
        public String toString()
        {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + Arrays.toString(days) +
                    '}';
        }
    }
}
