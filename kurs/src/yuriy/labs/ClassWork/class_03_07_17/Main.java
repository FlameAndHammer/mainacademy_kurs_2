package yuriy.labs.ClassWork.class_03_07_17;

/**
 * Created by Ruble on 03.07.2017.
 */
public class Main
{
    public static void main(String[] args) {
        UserAcount aac = new UserAcount(1000);
        for (int i = 0; i < 300; i++) {
            UserAction act = new UserAction(aac,100);
            act.start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(aac.getMoney());
    }
}
