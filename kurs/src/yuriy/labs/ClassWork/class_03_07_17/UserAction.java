package yuriy.labs.ClassWork.class_03_07_17;

/**
 * Created by Ruble on 03.07.2017.
 */
public class UserAction extends Thread
{
    private static Object lock = new Object();
    private UserAcount aac;
    private int withdraw;


    public UserAction (UserAcount aac,int withdraw)
    {

        this.aac=aac;
        this.withdraw=withdraw;

    }

    @Override
    public void run() {
        synchronized (lock){
        int has = aac.getMoney();
        try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (has>= withdraw){
                aac.setMoney(aac.getMoney()-withdraw);
            }



    }
    }
}
