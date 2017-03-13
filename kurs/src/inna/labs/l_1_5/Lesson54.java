package inna.labs.l_1_5;

/**
 * Created by ИННА on 13.03.2017.
 */
public class Lesson54 {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 1; x<300; x++) {
            if (x%3==0) {
                System.out.println(x);
                count++;
            }
            else if (x%4==0) {
                System.out.println(x);
                count++;
            }
            if (count == 10){
                break;
            }
        }

    }
}
