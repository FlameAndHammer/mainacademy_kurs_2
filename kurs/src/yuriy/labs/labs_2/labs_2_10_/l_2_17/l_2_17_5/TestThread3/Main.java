package yuriy.labs.labs_2.labs_2_10_.l_2_17.l_2_17_5.TestThread3;

/**
 * Created by Ruble on 20.07.2017.
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Thread storage = new Storage();
        Thread counter = new Counter();
        Thread printer = new Printer();

        storage.run();
        counter.run();
        printer.run();

 /*       storage.start();
        counter.start();
        printer.start();
*/
        storage.join();
        counter.join();
        printer.join();


    }
}
